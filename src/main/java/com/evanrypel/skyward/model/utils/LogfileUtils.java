package com.evanrypel.skyward.model.utils;

import java.util.HashMap;
import java.util.Map;

import com.evanrypel.skyward.model.Logfile;

public class LogfileUtils {
	private final static int VOLTAGE_INDEX = 28;
	
	public static Map<String, Integer> getStartingAndEndingVoltages(Logfile logfile) {
		Object[][] flightLoggingItems = logfile.getMessage().getFlight_logging().getFlight_logging_items();
		Object[] startItem = (Object[]) flightLoggingItems[0];
		Object[] finishItem = (Object[]) flightLoggingItems[flightLoggingItems.length - 1];
		int startingVoltage = (Integer) startItem[VOLTAGE_INDEX];
		int finishingVoltage = (Integer) finishItem[VOLTAGE_INDEX];
		
		HashMap<String, Integer> voltageMap = new HashMap<>();
		voltageMap.put("Starting", startingVoltage);
		voltageMap.put("Finishing", finishingVoltage);
		return voltageMap;
	}
}