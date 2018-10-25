package com.mict.ecg.controller;

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

import com.mict.ecg.model.EcgData;

@RestController
@CrossOrigin
public class MictEcgController {

	@Autowired
	EcgData ecgData;

	@GetMapping("cardiac/preferences") 
	public ResponseEntity<EcgData> getPatientSchedulingData()
	{
		System.out.println("PatientScedular : "+ecgData);

		return ResponseEntity.ok().body(ecgData);
	}

	@PostMapping("cardiac/preferences") 
	public ResponseEntity<EcgData> updatePatientSchedulingData(@RequestBody EcgData ed)
	{
		try {
	
			Properties props = new Properties();
	
			props.put("mict.ecgDevice", ed.getEcgDevice());
			props.put("mict.internalDevice.activeLead", ed.getInternalDevice().getActiveLead());
			props.put("mict.internalDevice.waveFormFilter", ed.getInternalDevice().getWaveFormFilter());
			props.put("mict.internalDevice.gain", ed.getInternalDevice().getGain());
			props.put("mict.internalDevice.impedenceSensitivity", ed.getInternalDevice().getImpedenceSensitivity());
			props.put("mict.internalDevice.pacerDetector", ed.getInternalDevice().getPacerDetector());
			props.put("mict.measurment.statisticsWindowLength", ed.getMeasurment().getStatisticsWindowLength());
			props.put("mict.measurment.irregularBeatWindowLength", ed.getMeasurment().getIrregularBeatWindowLength());
			props.put("mict.measurment.breathholdRecordLength", ed.getMeasurment().getBreathholdRecordLength());
			props.put("mict.cardiacMultiphaseInterval", ed.getCardiacMultiphaseInterval());
	
			File f = new File("C:\\Users\\akshays3\\Documents\\workspace\\mict_ecg\\src\\main\\resources\\cardiac.properties");
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
