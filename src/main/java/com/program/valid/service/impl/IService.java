package com.program.valid.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.valid.model.Organization;
import com.program.valid.repository.OrgRepository;
import com.program.valid.service.OrgService;

@Service
public class IService implements OrgService{
	
	@Autowired
	private OrgRepository repo;

	@Override
	public int saveOrg(Organization organization) {
		
		return repo.save(organization).getOrgId() ;
	}



	
}
