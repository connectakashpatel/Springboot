package com.earth.world.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.earth.world.model.Country;
import com.earth.world.service.CountryService;
import com.earth.world.service.StateService;

@RestController
public class CommonCtrl {
	
	@Autowired
	private StateService stateService;	
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/allstate")
	public List getAllState() {
		return stateService.getAllState();
	}
	
	@GetMapping("/country")
	public Optional<Country> getCountry() {
		return countryService.getCountryById(4);
	}
	

}
