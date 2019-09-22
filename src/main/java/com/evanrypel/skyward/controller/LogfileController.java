package com.evanrypel.skyward.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evanrypel.skyward.exception.LogfileNotFoundException;
import com.evanrypel.skyward.model.Logfile;
import com.evanrypel.skyward.model.utils.LogfileUtils;
import com.evanrypel.skyward.repository.LogfileRepository;

@RestController
@RequestMapping("/api/v1")
public class LogfileController
{
	@Autowired
	private LogfileRepository logfileRepository;
	
	@PostMapping("/logfile")
	public String createLogfile(@RequestBody Logfile logfile) {
		return logfileRepository.save(logfile);
	}
	
	@GetMapping("/logfile/{id}")
	public ResponseEntity<Object> getLogfile(
			@PathVariable(value = "id") String logfileId
	) throws LogfileNotFoundException {
		try {
			return ResponseEntity.ok(logfileRepository.retrieve(logfileId));
		} catch(LogfileNotFoundException ex) {
			return ResponseEntity
		            .status(HttpStatus.NOT_FOUND)
		            .body(ex.getMessage());
		}
	}
	
	@GetMapping(value = "/battery/voltages/{id}", produces = "application/json")
	public ResponseEntity<Object> getBatteryVoltages(
			@PathVariable(value = "id") String logfileId
	) {
		try {
			Logfile logfile = logfileRepository.retrieve(logfileId);
			return ResponseEntity.ok(LogfileUtils.getStartingAndEndingVoltages(logfile));
		} catch(LogfileNotFoundException ex) {
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body(ex.getMessage());
		}
	}
}
