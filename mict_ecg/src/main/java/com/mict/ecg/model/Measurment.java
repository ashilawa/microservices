package com.mict.ecg.model;

public class Measurment {

	private String statisticsWindowLength;
	
	private String irregularBeatWindowLength;
	
	private String breathholdRecordLength;

	public String getStatisticsWindowLength() {
		return statisticsWindowLength;
	}

	public void setStatisticsWindowLength(String statisticsWindowLength) {
		this.statisticsWindowLength = statisticsWindowLength;
	}

	public String getIrregularBeatWindowLength() {
		return irregularBeatWindowLength;
	}

	public void setIrregularBeatWindowLength(String irregularBeatWindowLength) {
		this.irregularBeatWindowLength = irregularBeatWindowLength;
	}

	public String getBreathholdRecordLength() {
		return breathholdRecordLength;
	}

	public void setBreathholdRecordLength(String breathholdRecordLength) {
		this.breathholdRecordLength = breathholdRecordLength;
	}
	
	
	
}
