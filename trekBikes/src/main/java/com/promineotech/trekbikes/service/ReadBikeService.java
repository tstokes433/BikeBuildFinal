package com.promineotech.trekbikes.service;

import java.util.List;

import com.promineotech.trekbikes.entity.*;

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
	List<Bike> fetchBike(Long bikeId);

	List<Frameset> fetchFrameset();

	List<Color> fetchColor();

	List<Drivetrain> fetchDrivetrain();

	List<Handlebar> fetchHandlebar();

	List<Saddle> fetchSaddle();

	List<Tire> fetchTire();
	
}