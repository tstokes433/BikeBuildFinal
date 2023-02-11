package com.promineotech.trekbikes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.trekbikes.dao.CreateBikeDao;
import com.promineotech.trekbikes.entity.*;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j

public class DefaultCreateBikeService implements CreateBikeService {

	@Autowired
	private CreateBikeDao createBikeDao;
	
	@Override
	public Bike newBike(Frameset frameset, Color color,  Drivetrain drivetrain, Handlebar handlebar,
			Saddle saddle, Tire tire) {
		log.info("newTrekBike has been called for Bike frameset={}, color={}, drivetrain={}, handlebar={}, saddle={}, tire={}", frameset, color, drivetrain, handlebar, saddle, tire);
		return createBikeDao.newBike(frameset, color, drivetrain, handlebar, saddle, tire);
	}

}