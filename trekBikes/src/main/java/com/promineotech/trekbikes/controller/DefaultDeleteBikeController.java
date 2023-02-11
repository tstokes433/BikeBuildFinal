package com.promineotech.trekbikes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.entity.*;
import com.promineotech.trekbikes.service.DeleteBikeService;

@RestController
public class DefaultDeleteBikeController implements DeleteBikeController {

	@Autowired
	private DeleteBikeService deleteBikeService;
	
	@Override
	public Bike deleteBike(Long bikeId) {
		return deleteBikeService.deleteBike(bikeId);
		
	}

}