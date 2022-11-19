package com.splyzateam.serviceImpl;

import com.splyzateam.common.ResponseModel;
import com.splyzateam.entity.UserRegistrationEntity;
import com.splyzateam.repository.UserRegistrationRepository;
import com.splyzateam.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    @Autowired
    private UserRegistrationRepository repository;

    @Override
    public ResponseModel save(UserRegistrationEntity userRegistrationEntity) {
        ResponseModel ouModel = new ResponseModel();
        UserRegistrationEntity entity=      repository.save(userRegistrationEntity);
        if (entity.getId()>0){
            ouModel.setResponseCode(1);
            ouModel.setResponseMessage("User Registration Successful");
        }else {
            ouModel.setResponseCode(0);
            ouModel.setResponseMessage("Fail to save data");
        }
        return  ouModel;
    }

    @Override
    public List<UserRegistrationEntity> getAll() {
        return repository.findAll();
    }
}
