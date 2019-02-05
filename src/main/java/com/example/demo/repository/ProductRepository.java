package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

	List<Product> findBy_id(String _id);

	List<Product> findBymanufacturer(String name);
	
	
//	@Query("SELECT AVG(u.age) from User u")
//    int getAverageAge();
//
//    @Query(value = "SELECT max(age) from User where first_name <> ?1", nativeQuery = true)
//int getMaxAgeMinus(String name);

}
