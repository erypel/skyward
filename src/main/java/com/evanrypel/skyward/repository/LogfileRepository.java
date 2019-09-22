package com.evanrypel.skyward.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.evanrypel.skyward.exception.LogfileNotFoundException;
import com.evanrypel.skyward.model.Logfile;

@Repository
public class LogfileRepository implements ObjectRepository<Logfile>
{
	private Map<String, Logfile> repository;

	public LogfileRepository() {
		this.repository = new HashMap<>();
	}
	
	@Override
	public String save(Logfile logfile)
	{
		String flightSessionId = logfile.getFlight_session_id();
		repository.put(flightSessionId, logfile);
		return flightSessionId;
	}

	@Override
	public Logfile retrieve(String id) throws LogfileNotFoundException
	{
		Logfile logfile = repository.get(id);
		if(logfile == null) {
			throw new LogfileNotFoundException("Logfile not found.");
		}
		return logfile;
	}
	
}
