package com.promineotech.trekbikes.service;

import java.util.List;

import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.entity.Color;
import com.promineotech.trekbikes.entity.Drivetrain;
import com.promineotech.trekbikes.entity.Frameset;
import com.promineotech.trekbikes.entity.Handlebar;
import com.promineotech.trekbikes.entity.Saddle;
import com.promineotech.trekbikes.entity.Tire;

public interface ReadBikeService {

	
	/**
	 * 
	 * @param color
	 * @param drivetrain
	 * @param frameset
	 * @param handlebar
	 * @param saddle
	 * @param tire
	 * @return
	 */
	List<Bike> fetchBike(Frameset frameset, Color color, Drivetrain drivetrain, Handlebar handlebar, Saddle saddle, Tire tire);
	
}