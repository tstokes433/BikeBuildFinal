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
		
		


	//DO BELOW FO ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// Method for Frameset
			//@formatter:off
			@Operation(
				summary = "Returns a list of Trek Bike components (frameset)",
				description = "Returns a list of tires",
				responses = {
										
			@ApiResponse(responseCode = "200",
				description = "The list of Bike options is returned",
				content = @Content(
				mediaType = "application/json",
				schema = @Schema(
				implementation = Frameset.class))),
										
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
			}
			)
								
			@GetMapping(value = "/fetchFrameset")
			@ResponseStatus(code = HttpStatus.OK)
			List<Frameset> fetchFrameset();
								
			//@formatter:on
					
	//DO ABOVE FOR ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!
								
								
		//DO BELOW FO ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// Method for Color
			//@formatter:off
			@Operation(
				summary = "Returns a list of Trek Bike components (color)",
				description = "Returns a list of tires",
				responses = {
													
			@ApiResponse(responseCode = "200",
				description = "The list of Bike options is returned",
				content = @Content(
				mediaType = "application/json",
				schema = @Schema(
				implementation = Color.class))),
													
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
			}
			)
											
			@GetMapping(value = "/fetchColor")
			@ResponseStatus(code = HttpStatus.OK)
			List<Color> fetchColor();
											
			//@formatter:on
								
	//DO ABOVE FOR ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!
											
											
											
											
	//DO BELOW FO ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// Method for Drivetrain
	//@formatter:off
			@Operation(
				summary = "Returns a list of Trek Bike components (drivetrain)",
				description = "Returns a list of tires",
				responses = {
																
			@ApiResponse(responseCode = "200",
				description = "The list of Bike options is returned",
				content = @Content(
				mediaType = "application/json",
				schema = @Schema(
				implementation = Drivetrain.class))),
																
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
		}
		)
														
			@GetMapping(value = "/fetchDrivetrain")
			@ResponseStatus(code = HttpStatus.OK)
				List<Drivetrain> fetchDrivetrain();
														
			//@formatter:on
	//DO ABOVE FOR ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!
					
	//DO BELOW FO ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// Method for Handlebar
			//@formatter:off
			@Operation(
				summary = "Returns a list of Trek Bike components (handlebar)",
				description = "Returns a list of tires",
				responses = {
																			
			@ApiResponse(responseCode = "200",
				description = "The list of Bike options is returned",
				content = @Content(
				mediaType = "application/json",
				schema = @Schema(
				implementation = Handlebar.class))),
																			
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
	}
		)
																	
			@GetMapping(value = "/fetchHandlebar")
			@ResponseStatus(code = HttpStatus.OK)
			List<Handlebar> fetchHandlebar();
																	
			//@formatter:on
													
	//DO ABOVE FOR ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!					
					
					
	//DO BELOW FOr ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// Method for Saddle
			//@formatter:off
			@Operation(
				summary = "Returns a list of Trek Bike components (saddle)",
				description = "Returns a list of tires",
				responses = {
																						
			@ApiResponse(responseCode = "200",
				description = "The list of Bike options is returned",
				content = @Content(
				mediaType = "application/json",
				schema = @Schema(
				implementation = Saddle.class))),
																						
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
		}
			)
																				
			@GetMapping(value = "/fetchSaddle")
			@ResponseStatus(code = HttpStatus.OK)
				List<Saddle> fetchSaddle();
																				
																				//@formatter:on
																	
											//DO ABOVE FOR ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!
		//DO BELOW FO ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// Method for Tire
			//@formatter:off
			@Operation(
				summary = "Returns a list of Trek Bike components (tires)",
				description = "Returns a list of tires",
				responses = {
																						
				@ApiResponse(responseCode = "200",
					description = "The list of Bike options is returned",
					content = @Content(
					mediaType = "application/json",
					schema = @Schema(
					implementation = Tire.class))),
																							
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
				}
						)
																							
				@GetMapping(value = "/fetchTire")
				@ResponseStatus(code = HttpStatus.OK)
					List<Tire> fetchTire();
																							
			//@formatter:on
																				
		//DO ABOVE FOR ALL COMPONENTS!!!!!!!!!!!!!!!!!!!!!!!!!!!!		
																				

	}