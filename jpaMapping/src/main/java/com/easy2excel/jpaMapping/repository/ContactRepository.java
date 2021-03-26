package com.easy2excel.jpaMapping.repository;

import com.easy2excel.jpaMapping.model.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactDetails, Long> {
}
