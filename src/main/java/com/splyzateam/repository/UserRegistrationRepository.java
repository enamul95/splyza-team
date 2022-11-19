package com.splyzateam.repository;

import com.splyzateam.entity.UserRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRegistrationRepository extends JpaRepository<UserRegistrationEntity, Long> {

}
