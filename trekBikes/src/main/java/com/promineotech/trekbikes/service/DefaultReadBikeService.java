package com.promineotech.trekbikes.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.trekbikes.dao.ReadBikeDao;
import com.promineotech.trekbikes.entity.*;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class DefaultReadBikeService implements ReadBikeService {
	@Autowired
	private ReadBikeDao readBikeDao;
	@Transactional	
	@Override
	public List<Bike> fetchBike(Long bikeId){
		log.info("fetchBike has been called for bikeId={}", bikeId);
		return readBikeDao.fetchBike(bikeId);
	}

	

		@Override
		public List<Frameset> fetchFrameset() {
			log.info("fetchFrameset has been called");
			return readBikeDao.fetchFrameset();
		}



		@Override
		public List<Color> fetchColor() {
			log.info("fetchColor has been called");
			return readBikeDao.fetchColor();
		}

		@Override
		public List<Drivetrain> fetchDrivetrain() {
			log.info("fetchDrivetrain has been called");
			return readBikeDao.fetchDrivetrain();
		}

		@Override
		public List<Handlebar> fetchHandlebar() {
			log.info("fetchHandlebar has been called");
			return readBikeDao.fetchHandlebar();
		}

		@Override
		public List<Saddle> fetchSaddle() {
			log.info("fetchSaddle has been called");
			return readBikeDao.fetchSaddle();
			}

		@Override
		public List<Tire> fetchTire() {
			log.info("fetchBike has been called");
			return readBikeDao.fetchTire();
		}
	//END	
//@Override
//	public List<Frameset> fetchFrameset(Frameset frameset) {
//		//log.info("fetchBike has been called for bikeId={}", frameset);
//		return readBikeDao.fetchFrameset(frameset);
//	}
//	@Override
//	public List<Color> fetchColor(Color color) {
//		//log.info("fetchBike has been called for bikeId={}", color);
//		return readBikeDao.fetchColor(color);
//	}
//	@Override
//	public List<Drivetrain> fetchDrivetrain(Drivetrain drivetrain) {
//		//log.info("fetchBike has been called for bikeId={}", bikeId);
//		return readBikeDao.fetchDrivetrain(drivetrain);
//	}
//	@Override
//	public List<Handlebar> fetchHandlebar(Handlebar handlebar) {
//		//log.info("fetchBike has been called for bikeId={}", bikeId);
//		return readBikeDao.fetchHandlebar(handlebar);
//	}
//	@Override
//	public List<Saddle> fetchSaddle(Saddle saddle) {
//		//log.info("fetchBike has been called for bikeId={}", bikeId);
//		return readBikeDao.fetchSaddle(saddle);
//	}
//	@Override
//	public List<Tire> fetchTire(Tire tire) {
//		//log.info("fetchBike has been called for bikeId={}", bikeId);
//		return readBikeDao.fetchTire(tire);
//	}

	
}