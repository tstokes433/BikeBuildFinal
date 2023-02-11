package com.promineotech.trekbikes.dao;

import com.promineotech.trekbikes.entity.*;

public interface CreateBikeDao {	
	
	Bike newBike(Frameset frameset, Color color, Drivetrain drivetrain, Handlebar handlebar, 
			Saddle saddle, Tire tire);
	
}