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
////Tire
//	@Override
//	public List<Frameset> fetchFrameset() {
//		log.info("fetchFrameset has been called");
//		return readBikeDao.fetchFrameset();
//	}
//
//
////END
////Tire
//	@Override
//	public List<Color> fetchColor() {
//		log.info("fetchColor has been called");
//		return readBikeDao.fetchColor();
//	}
//		//END
////Tire
//	@Override
//	public List<Drivetrain> fetchDrivetrain() {
//		log.info("fetchDrivetrain has been called");
//		return readBikeDao.fetchDrivetrain();
//	}
////END
////Tire
//	@Override
//	public List<Handlebar> fetchHandlebar() {
//		log.info("fetchHandlebar has been called");
//		return readBikeDao.fetchHandlebar();
//	}
////END
////Tire
//	@Override
//	public List<Saddle> fetchSaddle() {
//		log.info("fetchSaddle has been called");
//		return readBikeDao.fetchSaddle();
//		}
//	//END
////Tire
//	@Override
//	public List<Tire> fetchTire() {
//		log.info("fetchBike has been called");
//		return readBikeDao.fetchTire();
//	}
////END	
	
	@Override
	public List<Frameset> fetchFrameset() {
		return readBikeService.fetchFrameset();
	}


	@Override
	public List<Color> fetchColor() {
		return readBikeService.fetchColor();
	}


	@Override
	public List<Drivetrain> fetchDrivetrain() {
		return readBikeService.fetchDrivetrain();
	}


	@Override
	public List<Handlebar> fetchHandlebar() {
		return readBikeService.fetchHandlebar();
	}


	@Override
	public List<Saddle> fetchSaddle() {
		return readBikeService.fetchSaddle();
	}


	@Override
	public List<Tire> fetchTire() {
		return readBikeService.fetchTire();
	}

}