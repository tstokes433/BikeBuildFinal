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

		//READ Frameset !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		@Override
		public List<Frameset> fetchFrameset() {
			// @formatter:off
			String sql = ""
					+ "SELECT * "
					+ "FROM frameset";
			// @formatter:on
			
			Map<String, Object> params = new HashMap<>();
			
			return jdbcTemplate.query(sql, params, new RowMapper<>(){
				@Override
				public Frameset mapRow(ResultSet rs, int rowNum) throws SQLException {
					// @formatter:off
					return Frameset.valueOf(rs.getString("frameset_id"));
					// formatter:on
				}
			});
		}
	//END !!!!!!!!!!!!!!!!!!!!!!	
		//READ Color !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		@Override
		public List<Color> fetchColor() {
			// @formatter:off
			String sql = ""
					+ "SELECT * "
					+ "FROM color";
			// @formatter:on
			
			Map<String, Object> params = new HashMap<>();
			
			return jdbcTemplate.query(sql, params, new RowMapper<>(){
				@Override
				public Color mapRow(ResultSet rs, int rowNum) throws SQLException {
					// @formatter:off
					return Color.valueOf(rs.getString("color_id"));
					// formatter:on
				}
			});
		}
		
	//END !!!!!!!!!!!!!!!!!!!!!!
		
	//READ Drivetrain !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		@Override
		public List<Drivetrain> fetchDrivetrain() {
			// @formatter:off
			String sql = ""
					+ "SELECT * "
					+ "FROM drivetrain";
			// @formatter:on
			
			Map<String, Object> params = new HashMap<>();
			
			return jdbcTemplate.query(sql, params, new RowMapper<>(){
				@Override
				public Drivetrain mapRow(ResultSet rs, int rowNum) throws SQLException {
					// @formatter:off
					return Drivetrain.valueOf(rs.getString("drivetrain_id"));
					// formatter:on
				}
			});
		}
	//END !!!!!!!!!!!!!!!!!!!!!!	
	//READ Handlebar !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		@Override
		public List<Handlebar> fetchHandlebar() {
			// @formatter:off
			String sql = ""
					+ "SELECT * "
					+ "FROM handlebar";
			// @formatter:on
			
			Map<String, Object> params = new HashMap<>();
			
			return jdbcTemplate.query(sql, params, new RowMapper<>(){
				@Override
				public Handlebar mapRow(ResultSet rs, int rowNum) throws SQLException {
					// @formatter:off
					return Handlebar.valueOf(rs.getString("handlebar_id"));
					// formatter:on
				}
			});
		}
	//END !!!!!!!!!!!!!!!!!!!!!!	
	//READ Saddle !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		@Override
		public List<Saddle> fetchSaddle() {
			// @formatter:off
			String sql = ""
					+ "SELECT * "
					+ "FROM saddle";
			// @formatter:on
			
			Map<String, Object> params = new HashMap<>();
			
			return jdbcTemplate.query(sql, params, new RowMapper<>(){
				@Override
				public Saddle mapRow(ResultSet rs, int rowNum) throws SQLException {
					// @formatter:off
					return Saddle.valueOf(rs.getString("saddle_id"));
					// formatter:on
				}
			});
		}
	//END !!!!!!!!!!!!!!!!!!!!!!	
	//READ TIRE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Override
	public List<Tire> fetchTire() {
		// @formatter:off
		String sql = ""
				+ "SELECT * "
				+ "FROM tire";
		// @formatter:on
		
		Map<String, Object> params = new HashMap<>();
		
		return jdbcTemplate.query(sql, params, new RowMapper<>(){
			@Override
			public Tire mapRow(ResultSet rs, int rowNum) throws SQLException {
				// @formatter:off
				return Tire.valueOf(rs.getString("tire_id"));
				// formatter:on
			}
		});
	}
//END !!!!!!!!!!!!!!!!!!!!!!	
	
	
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