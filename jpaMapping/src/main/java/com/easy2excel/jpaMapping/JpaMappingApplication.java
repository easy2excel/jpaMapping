package com.easy2excel.jpaMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.easy2excel.jpaMapping.model.Person;
import com.easy2excel.jpaMapping.repository.CountryRepository;
import com.easy2excel.jpaMapping.repository.PersonRepository;



@SpringBootApplication
public class JpaMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaMappingApplication.class, args);
	}

	@Autowired
	CountryRepository countryRepository;
	@Autowired
	PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {
		
	

	}
}
