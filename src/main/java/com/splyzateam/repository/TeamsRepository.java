package com.splyzateam.repository;

import com.splyzateam.entity.TeamsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeamsRepository extends JpaRepository<TeamsEntity,Long> {

    @Query("FROM TeamsEntity WHERE id=:id")
    TeamsEntity findById(String id);
}
