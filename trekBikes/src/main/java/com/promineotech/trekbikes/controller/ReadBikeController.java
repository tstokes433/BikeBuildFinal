package com.promineotech.trekbikes.controller;

import java.util.List;

import com.promineotech.trekbikes.entity.*;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.trekbikes.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/ReadBike")
@OpenAPIDefinition(info = @Info(title = "Trek Bikes Build"), servers = {
		@Server(url = "http://localhost:8080", description = "Local server.")})


public interface ReadBikeController {
	
	//@formatter:off
		@Operation(
			summary = "Returns a list of Trek Bike components",
			description = "Returns a list of Bike components",
			responses = {
				
				@ApiResponse(responseCode = "200", 
						description = "The list of Bike options is returned", 
						content = @Content(
						mediaType = "application/json", 
						schema = @Schema(
						implementation = TrekBikes.class))),
				
				@ApiResponse(responseCode = "400", 
						description = "The request parameters are invalid", 
						content = @Content(
						mediaType = "application/json")),
				
				@ApiResponse(responseCode = "404",  
						description = "No Bike component were found with the input criteria", 
						content = @Content(
						mediaType = "application/json")),
				
				@ApiResponse(responseCode = "500",  
						description = "An unplanned error occured.", 
						content = @Content(
						mediaType = "application/json"))
			},
		
			parameters = { 
				@Parameter(
						name = "bikeId",  
						required = false, 
						description = "Returns a Bike"),
			
			}
		
				
		
			
		)
		@GetMapping(value = "/fetchTrekBikes")
		@ResponseStatus(code = HttpStatus.OK)
//		Order createOrder(@Valid @RequestBody OrderRequest orderRequest);

		List<Bike> fetchBike(
				@RequestParam(required = false)
				Long bikeId);	
		
//		
//		List<Frameset> fetchFrameset(
//				@RequestParam(required = false)
//				Frameset frameset);
//		
//		List<Color> fetchColor(	
//				@RequestParam(required = false)
//				Color color);
//		
//		List<Drivetrain> fetchDrivetrain(	
//				@RequestParam(required = false)
//				Drivetrain drivetrain);
//		
//		List<Handlebar> fetchHandlebar(	
//				@RequestParam(required = false)
//				Handlebar handlebar);
//		
//		List<Saddle> fetchSaddle(	
//				@RequestParam(required = false)
//				Saddle saddle);
//		
//		List<Tire> fetchTire(	
//				@RequestParam(required = false)
//				Tire tire);
		
		//@formatter:on
	}