package com.mict.ecg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mict.ecg.model.EcgData;
import com.mict.ecg.service.EcgService;

@RestController
@CrossOrigin
public class MictEcgController {

	@Autowired
	EcgService ecgService;

	
	@GetMapping("cardiac/preferences") 
	public ResponseEntity<EcgData> getPatientSchedulingData()
	{
		return ResponseEntity.ok().body(ecgService.getEcgData());
	}

	@PostMapping("cardiac/preferences") 
	public ResponseEntity<String> updatePatientSchedulingData(@RequestBody EcgData ecgData)
	{
		ecgService.updateEcgData(ecgData);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
