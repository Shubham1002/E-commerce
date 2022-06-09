package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.State;
import com.main.service.Stateservice;

@RestController
@CrossOrigin(origins = "*")
public class Statecontroller 
{
	@Autowired
	Stateservice ss;
	
	@PostMapping("/state/saveall")
	public void saveall(@RequestBody List<State> state)
	{
		ss.saveall(state);
	}
	
	@PostMapping("/state/save")
	public void savestate(@RequestBody State state)
	{
		ss.savestate(state);
	}
	
	@GetMapping("/state")
	public List<State> findallstate()
	{
		return ss.getallstates();
	}
	
	@GetMapping("/state/{id}")
	public State findbyid(@PathVariable("id") String id)
	{
		return ss.getstate(id);
	}
	
	@GetMapping("/country/{id}/state")
	public List<State> findbycountry(@PathVariable("id") String id)
	{
		return ss.getstatebycountry(id);
	}
	
	@PostMapping("/state/update")
	public void stateupdate(@RequestBody State state)
	{
		ss.update(state);
	}
}
