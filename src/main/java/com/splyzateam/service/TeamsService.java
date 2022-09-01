package com.splyzateam.service;

import com.splyzateam.entity.TeamsEntity;

import java.util.Optional;

public interface TeamsService {

    public TeamsEntity save(TeamsEntity entity);

    public Optional<TeamsEntity> getTeamsById(String teamId);
}
