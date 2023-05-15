package com.splyzateam.service;

import com.splyzateam.common.ResponseModel;
import com.splyzateam.entity.EmployeeEntity;

public interface EmployeeService {
    public ResponseModel save(EmployeeEntity employeeEntity);
}
