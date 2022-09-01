package com.splyzateam.serviceImpl;

import com.splyzateam.entity.TeamsEntity;
import com.splyzateam.repository.TeamsRepository;
import com.splyzateam.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamsServiceImpl implements TeamsService {

    @Autowired
    private TeamsRepository teamsRepository;

    @Override
    public TeamsEntity save(TeamsEntity teamsEntity) {
       return teamsRepository.save(teamsEntity);
    }

    @Override
    public Optional<TeamsEntity> getTeamsById(String teamId) {
        return teamsRepository.findById(teamId);
    }
}
