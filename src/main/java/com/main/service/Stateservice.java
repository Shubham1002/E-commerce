package com.main.service;

import java.util.List;

import com.main.model.State;

public interface Stateservice 
{
	public void saveall(List<State> state);
	public void savestate(State state);
	public State getstate(String id);
	public List<State> getallstates();
	public void update(State state);
	public List<State> getstatebycountry(String id);
}
