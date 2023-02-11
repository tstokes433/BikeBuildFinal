package com.promineotech.trekbikes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.trekbikes.entity.*;
import com.promineotech.trekbikes.service.ReadBikeService;

import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
public class DefaultReadBikeController implements ReadBikeController {

	@Autowired
	private ReadBikeService readBikeService;

	
	@Override
	public List<Bike> fetchBike(Frameset frameset, Color color, Drivetrain drivetrain, Handlebar handlebar,
			Saddle saddle, Tire tire) {
		log.info("frameset={}, color={}, drivetrain={}, handlebar={}, saddle={}, tire={}", frameset, color, drivetrain, handlebar, saddle, tire);
		return readBikeService.fetchBike(frameset, color, drivetrain, handlebar, saddle, tire);
	}

}