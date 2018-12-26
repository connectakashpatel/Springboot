package com.earth.world.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earth.world.dao.StateRepo;

@Service
public class StateService {

	@Autowired
	private StateRepo stateRepo;
	
	public List getAllState() {
		return stateRepo.findAll();
	}
	
	
}
