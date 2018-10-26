package com.mict.patientschedular.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.DefaultPropertiesPersister;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mict.patientschedular.model.PatientScedular;


@RestController
@CrossOrigin
public class PatientScedularController {

	@Autowired
	private PatientScedular patientScedular;

	@GetMapping("patientscedular/preferences") 
	public ResponseEntity<PatientScedular> getPatientSchedulingData()
	{
		System.out.println("PatientScedular : "+ patientScedular);
		return ResponseEntity.ok().body(patientScedular);
	}


	@PostMapping("patientscedular/preferences") 
	public ResponseEntity<PatientScedular> updatePatientSchedulingData(@RequestBody PatientScedular ps)
	{
		try {
			Properties props = new Properties();

			props.put("mict.callingAeTitle", ps.getCallingAeTitle());
			props.put("mict.useModalityWorkListStudyUID", ps.getUseModalityWorkListStudyUID());

			File f = new File("C:\\Users\\akshays3\\git\\localMicroservices\\mict_patientschedular\\src\\main\\resources\\patienceschedular.properties");
			OutputStream out = new FileOutputStream( f );
			// write into it
			DefaultPropertiesPersister p = new DefaultPropertiesPersister();
			p.store(props, out, "");		

		} catch (Exception e ) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(null);
	}

}
