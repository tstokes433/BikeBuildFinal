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

import com.promineotech.trekbikes.entity.Bike;
import com.promineotech.trekbikes.entity.Color;
import com.promineotech.trekbikes.entity.Drivetrain;
import com.promineotech.trekbikes.entity.Frameset;
import com.promineotech.trekbikes.entity.Handlebar;
import com.promineotech.trekbikes.entity.Saddle;
import com.promineotech.trekbikes.entity.Tire;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultReadBikeDao implements ReadBikeDao {
	
@Autowired
private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	
	public List<Bike> fetchBike(Long bikeId, Frameset frameset, Color color, Drivetrain drivetrain, Handlebar handlebar, Saddle saddle, Tire tire) {
		log.info(null, frameset, color, drivetrain, handlebar, saddle, tire);

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
					.bikeId(rs.getLong("bikeId"))
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


}