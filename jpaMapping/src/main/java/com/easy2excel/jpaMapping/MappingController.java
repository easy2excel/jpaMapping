package com.easy2excel.jpaMapping;

import com.easy2excel.jpaMapping.model.ContactDetails;
import com.easy2excel.jpaMapping.model.UserInfo;
import com.easy2excel.jpaMapping.repository.ContactRepository;
import com.easy2excel.jpaMapping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MappingController {
    
    @Autowired
    UserRepository userRepository;
    @Autowired
    ContactRepository contactRepository;
    
    @GetMapping("/test")
    public List<UserInfo> getAlluser() {
    return userRepository.findAll();
    }

    @GetMapping("/contacts")
    public List<ContactDetails> getContactDetailsList(){
        return contactRepository.findAll();
    }
}
