package com.splyzateam.controller;

import com.splyzateam.common.ResponseModel;
import com.splyzateam.entity.EmployeeEntity;
import com.splyzateam.entity.UserRegistrationEntity;
import com.splyzateam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("update-employee/{id}")
    public ResponseModel updateEmployee(@PathVariable long id,@RequestBody EmployeeEntity employeeEntity) {
        System.out.println("update employee = " + employeeEntity);
        employeeEntity.setId(id);
        return employeeService.save(employeeEntity);
    }

    @GetMapping("employee-list")
    public List<EmployeeEntity> getEmployeeList() {
        List<EmployeeEntity>  employeeList  =  employeeService.getEmployeeList();
        System.out.println("employeeList = " + employeeList);
        return employeeList;
    }


    @DeleteMapping("delete/{id}")
    public ResponseModel deleteEmployee(@PathVariable long id) {
        System.out.println("id = " + id);
        ResponseModel  deleteEmployee  =  employeeService.deleteEmployee(id);
        System.out.println("deleteEmployee = " + deleteEmployee);
        return deleteEmployee;
    }

}
