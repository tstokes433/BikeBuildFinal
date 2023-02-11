package com.promineotech.trekbikes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.entity.*;

import com.promineotech.trekbikes.service.CreateBikeService;
@RestController
public class DefaultCreateBikeController implements CreateBikeController {

	@Autowired
	private CreateBikeService createBikeService;
	
	@Override
	public Bike newBike(Frameset frameset, Color color, Drivetrain drivetrain, Handlebar handlebar,
			Saddle saddle, Tire tire) {
		return createBikeService.newBike(frameset, color, drivetrain, handlebar, saddle, tire);
	}

}