package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Catalog;

@Repository
public interface CatalogRepository extends MongoRepository<Catalog, String> {

}
