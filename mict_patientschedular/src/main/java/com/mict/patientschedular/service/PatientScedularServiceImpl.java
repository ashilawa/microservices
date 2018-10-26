package com.mict.patientschedular.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DefaultPropertiesPersister;

import com.mict.patientschedular.AppConfig;
import com.mict.patientschedular.model.PatientScedular;

@Service
public class PatientScedularServiceImpl implements PatientScedularService{

	@Autowired
	private AppConfig appConfig;
	
	@Autowired
	PatientScedular patientScedular;
	
	public PatientScedular getPatientScedularData() {
		
		return patientScedular;
	}

	public void updatePatientScedularData(PatientScedular schedularData) {
		
		try {
			Properties props = new Properties();

			props.put("mict.callingAeTitle", schedularData.getCallingAeTitle());
			props.put("mict.useModalityWorkListStudyUID", schedularData.getUseModalityWorkListStudyUID());

			File f = new File(appConfig.getBaseUrl());
			OutputStream out = new FileOutputStream( f );
			// write into it
			DefaultPropertiesPersister p = new DefaultPropertiesPersister();
			p.store(props, out, "");		

		} catch (Exception e ) {
			e.printStackTrace();
		}
	}

}
