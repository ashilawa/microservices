package com.mict.ecg.model;

public class InternalDevice {

	private String activeLead;
	
	private String waveFormFilter;
	
	private String gain;
	
	private String impedenceSensitivity;
	
	private String pacerDetector;

	public String getActiveLead() {
		return activeLead;
	}

	public void setActiveLead(String activeLead) {
		this.activeLead = activeLead;
	}

	public String getWaveFormFilter() {
		return waveFormFilter;
	}

	public void setWaveFormFilter(String waveFormFilter) {
		this.waveFormFilter = waveFormFilter;
	}

	public String getGain() {
		return gain;
	}

	public void setGain(String gain) {
		this.gain = gain;
	}

	public String getImpedenceSensitivity() {
		return impedenceSensitivity;
	}

	public void setImpedenceSensitivity(String impedenceSensitivity) {
		this.impedenceSensitivity = impedenceSensitivity;
	}

	public String getPacerDetector() {
		return pacerDetector;
	}

	public void setPacerDetector(String pacerDetector) {
		this.pacerDetector = pacerDetector;
	}
	
	
}
