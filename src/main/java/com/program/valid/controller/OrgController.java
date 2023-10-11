package com.program.valid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteOrg(@Valid @PathVariable Integer id){
		
		service.deleteById(id);
		
		return new ResponseEntity<String>("Sucessfully", HttpStatus.OK);
		
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateOrg(@Valid @RequestBody Organization organization){
		
	int id = service.saveOrg(organization);
		
		return new ResponseEntity<String>("Organization update sucessfully: "+id, HttpStatus.OK);
		
		
	}
	
	@GetMapping("/find/all")
	public ResponseEntity<?> getAllOrg(){
		
	List<Organization> list= service.getAll();
		
		return new ResponseEntity<List<Organization>>( list, HttpStatus.OK);
		
		
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> saveOrg(@Valid @PathVariable Integer id){
		
	 Organization org = service.getById(id);
		
		return new ResponseEntity<>("Detail: "+org, HttpStatus.OK);
		
		
	}

	@GetMapping("/more/{dou}")
	public ResponseEntity<?> moreThan300(@PathVariable Double dou){
		
		service.getDataMoreThan300(dou);
		
		return new ResponseEntity<List<Organization>>(service.getDataMoreThan300(dou), HttpStatus.OK);
	}
}
