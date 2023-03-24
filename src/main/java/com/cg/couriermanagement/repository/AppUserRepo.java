package com.cg.couriermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.couriermanagement.entity.AppUserEntity;

@Repository
public interface AppUserRepo extends JpaRepository<AppUserEntity,Integer>{

}

