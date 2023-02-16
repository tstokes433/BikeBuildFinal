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
	public List<Bike> fetchBike(Long bikeId)
			 
	{
		log.info("bikeId={}", bikeId);
		return readBikeService.fetchBike(bikeId);
	}


//	@Override
//	public List<Frameset> fetchFrameset(Frameset frameset) {
//		return readBikeService.fetchFrameset(frameset);
//	}
//
//
//	@Override
//	public List<Color> fetchColor(Color color) {
//		return readBikeService.fetchColor(color);
//	}
//
//
//	@Override
//	public List<Drivetrain> fetchDrivetrain(Drivetrain drivetrain) {
//		return readBikeService.fetchDrivetrain(drivetrain);
//	}
//
//
//	@Override
//	public List<Handlebar> fetchHandlebar(Handlebar handlebar) {
//		return readBikeService.fetchHandlebar(handlebar);
//	}
//
//
//	@Override
//	public List<Saddle> fetchSaddle(Saddle saddle) {
//		return readBikeService.fetchSaddle(saddle);
//	}
//
//
//	@Override
//	public List<Tire> fetchTire(Tire tire) {
//		return readBikeService.fetchTire(tire);
//	}

}