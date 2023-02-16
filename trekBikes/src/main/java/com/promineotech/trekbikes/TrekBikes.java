package com.promineotech.trekbikes;

//http://localhost:8080/swagger-ui/index.html#/DefaultCreateBikeController

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.promineotech.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class TrekBikes extends SpringBootServletInitializer
{

	public static void main(String[] args) {
		SpringApplication.run(TrekBikes.class, args);
	}
	
}
