package com.promineotech.trekbikes.service;

import com.promineotech.trekbikes.entity.*;

public interface DeleteBikeService {

	/**
	 * 
	 * @param bikeId
	 * @return
	 */
	
	Bike deleteBike(Long bikeId);
	
}