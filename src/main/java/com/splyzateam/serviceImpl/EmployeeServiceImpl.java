package com.splyzateam.serviceImpl;

import com.splyzateam.common.ResponseModel;
import com.splyzateam.entity.EmployeeEntity;
import com.splyzateam.repository.EmployeeRepository;
import com.splyzateam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public ResponseModel save(EmployeeEntity employeeEntity) {
        ResponseModel ouModel = new ResponseModel();
        EmployeeEntity entity = null;
        System.out.println("save--"+employeeEntity.getId());
        if(employeeEntity.getId() == null || employeeEntity.getId() == 0){
            entity=  employeeRepository.save(employeeEntity);
        }else{
            entity = employeeRepository.save(employeeEntity);
        }
       // EmployeeEntity entity =   employeeRepository.save(employeeEntity);

        if (entity.getId()>0){
            ouModel.setResponseCode(1);
            ouModel.setResponseMessage("Employee Save Successfully");
        }else {
            ouModel.setResponseCode(0);
            ouModel.setResponseMessage("Fail to save data");
        }
        return  ouModel;

    }

    @Override
    public List<EmployeeEntity> getEmployeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public ResponseModel deleteEmployee(long id) {
        employeeRepository.deleteById(id);
        ResponseModel ouModel = new ResponseModel();

            ouModel.setResponseCode(1);
            ouModel.setResponseMessage("Employee Delete Successfully");

        return ouModel;
    }
}
