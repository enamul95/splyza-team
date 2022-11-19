package com.splyzateam.controller;

import com.splyzateam.common.ResponseModel;
import com.splyzateam.entity.UserRegistrationEntity;
import com.splyzateam.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/splyza-teams/user/v1/")
public class UserRegistrationController {

    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping("save")
    public ResponseModel save(@RequestBody  UserRegistrationEntity userRegistrationEntity) {
        return userRegistrationService.save(userRegistrationEntity);
    }

    @GetMapping("all-user")
    public List<UserRegistrationEntity> getAll(){
        return userRegistrationService.getAll();
    }
}
