package com.promineotech.trekbikes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.promineotech.trekbikes.entity.*;

//import lombok.extern.slf4j.Slf4j;

@Component
//@Slf4j
public class DefaultReadBikeDao implements ReadBikeDao {
	
@Autowired
private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	
	public List<Bike> fetchBike(Long bikeId) {
	//	log.info(null, bikeId);

	// @formatter:off
	String sql = ""
			+ "SELECT * "
			+ "FROM bike "
			+ "WHERE bike_pk = :bike_pk";
	// @formatter:on
	
	Map<String, Object> params = new HashMap<>();
	params.put("bike_pk", bikeId);

	
	return jdbcTemplate.query(sql, params, new RowMapper<>(){


		@Override
		public Bike mapRow(ResultSet rs, int rowNum) throws SQLException {
			// @formatter:off
			return Bike.builder()
					.bikeId(rs.getLong("bike_pk"))
					.frameset(Frameset.valueOf(rs.getString("frameset_id")))
					.color(Color.valueOf(rs.getString("color_id")))
					.drivetrain(Drivetrain.valueOf(rs.getString("drivetrain_id")))
					.handlebar(Handlebar.valueOf(rs.getString("handlebar_id")))
					.saddle(Saddle.valueOf(rs.getString("saddle_id")))
					.tire(Tire.valueOf(rs.getString("tire_id")))
					.build();
			// formatter:on
		}
	});
	}

//	@Override
//	public List<Frameset> fetchFrameset(Frameset frameset) {
//		//	log.info(null, bikeId);
//
//		// @formatter:off
//		String sql = ""
//				+ "SELECT * "
//				+ "FROM frameset "
//				+ "WHERE frameset_pk = :frameset_pk";
//		// @formatter:on
//		
//		Map<String, Object> params = new HashMap<>();
//		params.put("frameset_pk", frameset);
//
//		
//		return jdbcTemplate.query(sql, params, new RowMapper<>(){
//

//			@Override
//			public Frameset mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// @formatter:off
//				return Frameset.builder()
//						.bikeId(rs.getLong("bike_pk"))
//						.frameset(Frameset.valueOf(rs.getString("frameset_id")))
//						.build();
//				// formatter:on
//			}
//		});
//	
//	}
//
//	@Override
//	public List<Color> fetchColor(Color color) {
//		// TODO Auto-generated method stub
//				return null;
//	}
//
//	@Override
//	public List<Drivetrain> fetchDrivetrain(Drivetrain drivetrain) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Handlebar> fetchHandlebar(Handlebar handlebar) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Saddle> fetchSaddle(Saddle saddle) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Tire> fetchTire(Tire tire) {
//		// TODO Auto-generated method stub
//		return null;
//	}


}