package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import com.example.demo.model.Catalog;
import com.example.demo.model.Category;

public class CategoryRepositoryImpl implements CategoryRepositoryCustom {
	private final MongoTemplate mongoTemplate;

    @Autowired
    public CategoryRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    @Override
    public List<Category> aggregate() {
    	MatchOperation matchOperation = getMatchOperation();
        return mongoTemplate.aggregate(Aggregation.newAggregation(
                //matchOperation,
                project("_id", "name", "image"),
                lookupOperation
        ), Category.class, Category.class).getMappedResults();
    }

    private MatchOperation getMatchOperation() {
        Criteria priceCriteria = where("catalog_id").is("Singha");
        //return project("_id", "name", "image");
        return match(priceCriteria);
    }
    LookupOperation lookupOperation = LookupOperation.newLookup()
    	    .from("catalog")
    	    .localField("catalog_id")
    	    .foreignField("catalog_id")
    	    .as("image");

}

