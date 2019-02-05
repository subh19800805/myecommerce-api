package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Catalog;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CatalogRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;

@RestController
public class Controller {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CatalogRepository catalogRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping("/all")
    public List<Product> getAll(){
        List<Product> product = this.productRepository.findAll();

        return product;
    } 
	// ****************** Product *******************
	@GetMapping("/products")
    public List<Product> getAllProduct(){
        List<Product> product = this.productRepository.findAll();
        return product;
    }
	@GetMapping("/products/{id}")
    public List<Product> findBy_id(@PathVariable String id){
        List<Product> product = this.productRepository.findBy_id(id);
        return product;
    }
	@GetMapping("/manufacturer/{name}")
    public List<Product> findBymanufacturer(@PathVariable String name){
        List<Product> product = this.productRepository.findBymanufacturer(name);
        return product;
    }
	@PostMapping("/addproduct")
    public void insertProduct(@RequestBody Product product){
		productRepository.save(product);
    }
	
	
	// ****************** Catalog *******************
	@GetMapping("/catalogs")
    public List<Catalog> getAllCatalog(){
        List<Catalog> catalog = this.catalogRepository.findAll();

        return catalog;
    }
	@PostMapping("/catalogsave")
    public void insertCatalog(@RequestBody Catalog cat){
		catalogRepository.save(cat);
    }
	// ****************** Category *******************
		@GetMapping("/category")
	    public List<Category> getAllCatgory(){
	        List<Category> category = this.categoryRepository.aggregate();

	        return category;
	    }
				
		@PostMapping("/categorysave")
	    public void insertCategory(@RequestBody Category cat){
			categoryRepository.save(cat);
			System.out.println("Collection Aggregrated.");
	    }

}
