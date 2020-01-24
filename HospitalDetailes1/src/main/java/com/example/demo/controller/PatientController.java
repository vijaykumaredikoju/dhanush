package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.boot.model.relational.Sequence;
import org.hibernate.service.Service;
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

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;
@RestController
@RequestMapping
public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	//Retrive
	@GetMapping("/Retrive")
	public List<Patient> getAllCustomer()
	{
		return  patientRepository.findAll();
	}
	
	//Create
	@PostMapping("/add")
	public String createCustomer(@Valid @RequestBody Patient cus)
	{
		Patient	c = patientRepository.save(cus);
		return "sucess"+ c;
	}
	
	
	//Delete
	@DeleteMapping("/delete/{cnum}")
	public String deleteCustomer(@PathVariable Long cnum){
		patientRepository.deleteById(cnum);
		
		return "Sucess";
	}
	
	@GetMapping("//{cnum}")
	public Optional<Patient> deleteCustomer1(@PathVariable Long cnum){
		return  patientRepository.findById(cnum);	
		
	}
	
	
	//Updated
	@PutMapping("/update/{cnum}")
	public String updateCutsomer(@RequestBody Patient cnum)
	{
		
		patientRepository.save(cnum);
		return "update";
	}
	
	
	
	
	
	
 }


