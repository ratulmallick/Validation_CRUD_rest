package com.program.valid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.program.valid.model.Organization;

@Repository
public interface OrgRepository extends JpaRepository<Organization, Integer>{
	
	
	@Query("SELECT o FROM Organization o WHERE o.orgCollection >:dou")
	public List<Organization> getDataMoreThan300(Double dou);

}
