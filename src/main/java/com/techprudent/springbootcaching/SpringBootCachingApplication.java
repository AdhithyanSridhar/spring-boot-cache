package com.techprudent.springbootcaching;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.techprudent.springbootcaching.entity.Customer;
import com.techprudent.springbootcaching.repo.CustomerRepo;

@SpringBootApplication
@EnableCaching
public class SpringBootCachingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCachingApplication.class, args);
	}

	@Autowired
	CustomerRepo cr;

	@Override
	public void run(String... args) throws Exception {

		cr.deleteAll();

		Customer customer1 = new Customer();
		customer1.setName("customer1");
		customer1.setGender("male");
		customer1.setContact("123");

		Customer customer2 = new Customer();
		customer2.setName("customer2");
		customer2.setGender("female");
		customer2.setContact("456");

		cr.saveAll(Arrays.asList(customer1, customer2));

	}
}
