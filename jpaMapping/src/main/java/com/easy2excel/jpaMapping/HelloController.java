package com.easy2excel.jpaMapping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easy2excel.jpaMapping.model.Country;
import com.easy2excel.jpaMapping.model.Person;
import com.easy2excel.jpaMapping.repository.PersonRepository;

import java.util.List;

@RestController
public class HelloController {
    
    @Autowired
    PersonRepository personRepository;
   
    
    @GetMapping("/persons")
    public List<Person> getAllUsers() {
		return null;
    }

    @GetMapping("/countries")
    public List<Country> getCountryList(){
		return null;
    }
}
