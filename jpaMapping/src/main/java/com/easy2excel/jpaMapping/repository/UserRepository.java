package com.easy2excel.jpaMapping.repository;

import com.easy2excel.jpaMapping.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
}
