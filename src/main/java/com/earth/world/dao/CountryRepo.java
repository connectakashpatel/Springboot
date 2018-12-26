package com.earth.world.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.earth.world.model.Country;

public interface CountryRepo extends JpaRepository<Country, Integer> {

}
