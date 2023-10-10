package com.program.valid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.valid.model.Organization;
import com.program.valid.service.OrgService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/valid")
public class OrgController {
	
	@Autowired
	private OrgService service;
	
	
	@PostMapping("/save")
	public ResponseEntity<?> saveOrg(@Valid @RequestBody Organization organization){
		
	int id = service.saveOrg(organization);
		
		return new ResponseEntity<String>("Organization Saved: "+id, HttpStatus.OK);
		
		
	}

}
