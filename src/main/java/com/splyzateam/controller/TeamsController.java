package com.splyzateam.controller;

import com.splyzateam.entity.TeamsEntity;
import com.splyzateam.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/splyza-teams/v1")
public class TeamsController {

    @Autowired
    private TeamsService teamsService;

    @PostMapping("/save")
    public TeamsEntity save(@RequestBody TeamsEntity teamsEntity){
        return teamsService.save(teamsEntity);
    }

    @GetMapping("/teams/{teamId}")
    public Optional<TeamsEntity> getTeamsById(@PathVariable String teamId) {
        return teamsService.getTeamsById(teamId);
    }
}
