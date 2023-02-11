package com.promineotech.trekbikes.dao;

import com.promineotech.trekbikes.entity.Bike;

public interface DeleteBikeDao {


/**
 * 
 * @param bikeId
 * @return
 */
	
	Bike deleteBike(Long bikeId);
	
}
