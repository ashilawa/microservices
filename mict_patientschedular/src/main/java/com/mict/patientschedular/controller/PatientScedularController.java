package com.mict.patientschedular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mict.patientschedular.model.PatientScedular;
import com.mict.patientschedular.service.PatientScedularService;


@RestController
@CrossOrigin
public class PatientScedularController {

	@Autowired
	PatientScedularService patientScedularService;
	

	@GetMapping("patientscedular/preferences") 
	public ResponseEntity<PatientScedular> getPatientSchedulingData()
	{
		return ResponseEntity.ok().body(patientScedularService.getPatientScedularData());
	}


	@PostMapping("patientscedular/preferences") 
	public ResponseEntity<String> updatePatientSchedulingData(@RequestBody PatientScedular patientScedular)
	{
		patientScedularService.updatePatientScedularData(patientScedular);
	
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
