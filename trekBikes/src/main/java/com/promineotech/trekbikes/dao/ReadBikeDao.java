package com.promineotech.trekbikes.dao;

import java.util.List;
import com.promineotech.trekbikes.entity.*;

public interface ReadBikeDao {

	/**
	 * 
	 * @param bikeId
	 * @param frameset
	 * @param color
	 * @param drivetrain
	 * @param handlebar
	 * @param saddle
	 * @param tire
	 * @return
	 */

	List<Bike> fetchBike(Long bikeId);
//
	List<Frameset> fetchFrameset();

	List<Color> fetchColor();

	List<Drivetrain> fetchDrivetrain();

	List<Handlebar> fetchHandlebar();

	List<Saddle> fetchSaddle();

	List<Tire> fetchTire();


}
