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

//	List<Frameset> fetchFrameset(Frameset frameset);
//
//	List<Color> fetchColor(Color color);
//
//	List<Drivetrain> fetchDrivetrain(Drivetrain drivetrain);
//
//	List<Handlebar> fetchHandlebar(Handlebar handlebar);
//
//	List<Saddle> fetchSaddle(Saddle saddle);
//
//	List<Tire> fetchTire(Tire tire);
//	
}