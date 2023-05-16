package com.splyzateam.repository;

import com.splyzateam.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository  extends JpaRepository<EmployeeEntity,Long> {

}
