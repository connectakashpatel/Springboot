package com.earth.world.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earth.world.dao.CountryRepo;
import com.earth.world.model.Country;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepo countryRepo;
	
	public Optional<Country> getCountryById(int countryCode) {
		return countryRepo.findById(countryCode);
		
	}

}
