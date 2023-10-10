package com.program.valid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.program.valid.model.Organization;

@Repository
public interface OrgRepository extends JpaRepository<Organization, Integer>{

}
