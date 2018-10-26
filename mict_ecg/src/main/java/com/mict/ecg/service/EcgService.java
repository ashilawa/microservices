package com.mict.ecg.service;

import com.mict.ecg.model.EcgData;

public interface EcgService {

	public EcgData getEcgData();
	
	public void updateEcgData(EcgData data);
}
