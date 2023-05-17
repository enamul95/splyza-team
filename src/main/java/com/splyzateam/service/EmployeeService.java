package com.splyzateam.service;

import com.splyzateam.common.ResponseModel;
import com.splyzateam.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    public ResponseModel save(EmployeeEntity employeeEntity);

    public List<EmployeeEntity> getEmployeeList();

    public ResponseModel deleteEmployee(long id);
}
