package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repository.ProductRepository;

@Component
public class ProductLoader implements CommandLineRunner {
	@Autowired
	private ProductRepository pr;
	
	@Override
	public void run(String...strings) throws Exception {
//		pr.save(new Product(UUID.randomUUID().toString(), "Simsong One mobile phone", "The greatest Onedroid phone on the market ....."));
//		pr.save(new Product(UUID.randomUUID().toString(), "Simsong One mobile phone2", "The greatest Onedroid phone on the market ....."));
//		pr.save(new Product(UUID.randomUUID().toString(), "Simsong One mobile phone3", "The greatest Onedroid phone on the market ....."));		
	}

}
