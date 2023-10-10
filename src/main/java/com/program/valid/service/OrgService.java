package com.program.valid.service;

import java.util.List;

import com.program.valid.model.Organization;

public interface OrgService {
	
	public int saveOrg(Organization organization);
	
	public void deleteById(Integer id);
	
	public int updateById(Organization organization);
	
	public List<Organization> getAll();
	
	public Organization getById(Integer id);

}
