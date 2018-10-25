package com.mict.patientschedular.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:patienceschedular.properties")
@ConfigurationProperties("mict")
public class PatientScedular {

	
	private String callingAeTitle;
	private String useModalityWorkListStudyUID;
	
	public PatientScedular()
	{
		
	}

	public String getCallingAeTitle() {
		return callingAeTitle;
	}

	public void setCallingAeTitle(String callingAeTitle) {
		this.callingAeTitle = callingAeTitle;
	}

	public String getUseModalityWorkListStudyUID() {
		return useModalityWorkListStudyUID;
	}

	public void setUseModalityWorkListStudyUID(String useModalityWorkListStudyUID) {
		this.useModalityWorkListStudyUID = useModalityWorkListStudyUID;
	}

	@Override
	public String toString() {
		return "PatientScedular [callingAeTitle=" + callingAeTitle
				+ ", useModalityWorkListStudyUID="
				+ useModalityWorkListStudyUID + ", getCallingAeTitle()="
				+ getCallingAeTitle() + ", getUseModalityWorkListStudyUID()="
				+ getUseModalityWorkListStudyUID() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
