package com.ds.cab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ds.cab.engine.Engine;

@Component
public class Car {
	
	@Autowired
	@Qualifier("eng2")
	private Engine engine;

	@Override
	public String toString() {
		return "Car [Engine Name =" + engine.getEngineName() + "]";
	}
	
}
