package com.splyzateam.service;

import com.splyzateam.common.ResponseModel;
import com.splyzateam.entity.UserRegistrationEntity;

import java.util.List;

public interface UserRegistrationService {

    public ResponseModel save(UserRegistrationEntity userRegistrationEntity);

    public List<UserRegistrationEntity> getAll();
}
