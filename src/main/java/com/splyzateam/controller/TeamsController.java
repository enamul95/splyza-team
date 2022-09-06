package com.splyzateam.controller;

import com.splyzateam.entity.InviteEntity;
import com.splyzateam.entity.TeamsEntity;
import com.splyzateam.service.InviteService;
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

    @Autowired
    private InviteService inviteService;

    @PostMapping("/save")
    public TeamsEntity save(@RequestBody TeamsEntity teamsEntity){
        return teamsService.save(teamsEntity);
    }

    @GetMapping("/teams/{teamId}")
    public TeamsEntity getTeamsById(@PathVariable String teamId) {
        return teamsService.getTeamsById(teamId);
    }

    @PostMapping("/teams/{teamId}/invites")
    public InviteEntity saveInvite(@PathVariable String teamId,@RequestBody  InviteEntity inviteEntity){
        inviteEntity.setTeamId(teamId);
        return inviteService.save(inviteEntity);
    }
}
