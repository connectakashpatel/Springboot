package com.earth.world.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.earth.world.model.State;

public interface StateRepo extends JpaRepository<State, Integer> {

}
