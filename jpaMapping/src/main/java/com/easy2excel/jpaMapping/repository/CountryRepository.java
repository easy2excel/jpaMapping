package com.easy2excel.jpaMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easy2excel.jpaMapping.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
