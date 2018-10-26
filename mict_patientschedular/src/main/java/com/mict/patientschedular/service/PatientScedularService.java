package com.mict.patientschedular.service;

import com.mict.patientschedular.model.PatientScedular;

public interface PatientScedularService {
	
	public PatientScedular getPatientScedularData();
	
	public void updatePatientScedularData(PatientScedular patientScedular);
}
