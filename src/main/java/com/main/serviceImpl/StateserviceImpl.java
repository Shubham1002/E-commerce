package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.State;
import com.main.repo.Staterepo;
import com.main.service.Stateservice;

@Service
public class StateserviceImpl implements Stateservice
{
	@Autowired
	Staterepo sr;

	@Override
	public void saveall(List<State> state) {
		// TODO Auto-generated method stub
		sr.saveAll(state);
	}

	@Override
	public void savestate(State state) {
		// TODO Auto-generated method stub
		sr.save(state);
	}

	@Override
	public State getstate(String id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public List<State> getallstates() {
		// TODO Auto-generated method stub
		List<State> lst=sr.findAll();
		return lst;
	}

	@Override
	public void update(State state) {
		// TODO Auto-generated method stub
		sr.saveAndFlush(state);
	}

	@Override
	public List<State> getstatebycountry(String id) {
		// TODO Auto-generated method stub
		return sr.findByCountry_CountryId(id);
	}
}
