package com.splyzateam.controller;

import com.splyzateam.common.ResponseModel;
import com.splyzateam.entity.EmployeeEntity;
import com.splyzateam.entity.UserRegistrationEntity;
import com.splyzateam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/employee/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("save")
    public ResponseModel save(@RequestBody EmployeeEntity employeeEntity) {
        System.out.println("employeeEntity = " + employeeEntity);

        return employeeService.save(employeeEntity);
    }

}
