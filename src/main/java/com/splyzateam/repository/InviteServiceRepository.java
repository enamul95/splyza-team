package com.splyzateam.repository;

import com.splyzateam.entity.InviteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InviteServiceRepository extends JpaRepository<InviteEntity,Long> {

}
