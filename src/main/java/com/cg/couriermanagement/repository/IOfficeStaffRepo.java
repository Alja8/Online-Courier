package com.cg.couriermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.couriermanagement.entity.OfficeStaffMemberEntity;

@Repository
public interface IOfficeStaffRepo extends JpaRepository<OfficeStaffMemberEntity,Integer>{

}
