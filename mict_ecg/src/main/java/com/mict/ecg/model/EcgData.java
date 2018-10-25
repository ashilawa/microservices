package com.mict.ecg.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:cardiac.properties")
@ConfigurationProperties("mict")
public class EcgData {

	private String ecgDevice;
	
	private InternalDevice internalDevice;
	
	private Measurment measurment;
	
	private String cardiacMultiphaseInterval;

	public String getEcgDevice() {
		return ecgDevice;
	}

	public void setEcgDevice(String ecgDevice) {
		this.ecgDevice = ecgDevice;
	}

	public InternalDevice getInternalDevice() {
		return internalDevice;
	}

	public void setInternalDevice(InternalDevice internalDevice) {
		this.internalDevice = internalDevice;
	}

	public Measurment getMeasurment() {
		return measurment;
	}

	public void setMeasurment(Measurment measurment) {
		this.measurment = measurment;
	}

	public String getCardiacMultiphaseInterval() {
		return cardiacMultiphaseInterval;
	}

	public void setCardiacMultiphaseInterval(String cardiacMultiphaseInterval) {
		this.cardiacMultiphaseInterval = cardiacMultiphaseInterval;
	}
	
}
