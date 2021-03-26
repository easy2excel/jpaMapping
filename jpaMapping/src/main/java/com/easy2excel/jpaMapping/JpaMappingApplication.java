package com.easy2excel.jpaMapping;

import com.easy2excel.jpaMapping.model.ContactDetails;
import com.easy2excel.jpaMapping.model.UserInfo;
import com.easy2excel.jpaMapping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class JpaMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaMappingApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;


	@Override
	public void run(String... args) throws Exception {

		UserInfo info = new UserInfo();
		info.setFirstName("anil");
		info.setLastName("sahoo");

		ContactDetails contactDetails = new ContactDetails();
		contactDetails.setCountry("india");
		contactDetails.setEmail("anilkumarsahoo17@gmail.com");
		contactDetails.setPhoneNumber("9658111149");
		contactDetails.setState("Odisha");
		contactDetails.setUser(info);

		ContactDetails contactDetails2 = new ContactDetails();
		contactDetails2.setCountry("india");
		contactDetails2.setEmail("anilkumarsahoo17@gmail.com");
		contactDetails2.setPhoneNumber("9658111149");
		contactDetails2.setState("Odisha");
		contactDetails2.setUser(info);
		info.setContacts(Arrays.asList(contactDetails,contactDetails2));

		//userRepository.save(info);
	}
}
