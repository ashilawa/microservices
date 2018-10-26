package com.mict.ecg.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DefaultPropertiesPersister;

import com.mict.ecg.AppConfig;
import com.mict.ecg.model.EcgData;

@Service
public class EcgDataServiceImpl implements EcgService {

	@Autowired
	private AppConfig appConfig;
	
	@Autowired
	EcgData ecgData;
	
	
	@Override
	public EcgData getEcgData() {


		return ecgData;
	}

	@Override
	public void updateEcgData(EcgData data) {
		
		try {
			
			Properties props = new Properties();
	
			props.put("mict.ecgDevice", data.getEcgDevice());
			props.put("mict.internalDevice.activeLead", data.getInternalDevice().getActiveLead());
			props.put("mict.internalDevice.waveFormFilter", data.getInternalDevice().getWaveFormFilter());
			props.put("mict.internalDevice.gain", data.getInternalDevice().getGain());
			props.put("mict.internalDevice.impedenceSensitivity", data.getInternalDevice().getImpedenceSensitivity());
			props.put("mict.internalDevice.pacerDetector", data.getInternalDevice().getPacerDetector());
			props.put("mict.measurment.statisticsWindowLength", data.getMeasurment().getStatisticsWindowLength());
			props.put("mict.measurment.irregularBeatWindowLength", data.getMeasurment().getIrregularBeatWindowLength());
			props.put("mict.measurment.breathholdRecordLength", data.getMeasurment().getBreathholdRecordLength());
			props.put("mict.cardiacMultiphaseInterval", data.getCardiacMultiphaseInterval());
	
			File f = new File("C:\\Users\\akshays3\\git\\localMicroservices\\mict_ecg\\src\\main\\resources\\cardiac.properties");	     
			OutputStream out = new FileOutputStream( f );
		     DefaultPropertiesPersister p = new DefaultPropertiesPersister();
		     p.store(props, out, "");
		} catch (Exception e ) {
			e.printStackTrace();
		}
		
	}

}
