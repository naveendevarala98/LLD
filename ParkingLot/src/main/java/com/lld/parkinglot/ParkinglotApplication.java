package com.lld.parkinglot;

import com.lld.parkinglot.model.Compactspot;
import com.lld.parkinglot.model.Largestspot;
import com.lld.parkinglot.model.Parkingfloor;
import com.lld.parkinglot.model.Parkingspot;
import com.lld.parkinglot.service.ParkinglotService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkinglotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkinglotApplication.class, args);
	}

	@PostConstruct
	public void main(){
		ParkinglotService parkinglotService = new ParkinglotService(123,"abc");
		Parkingfloor parkingfloor = new Parkingfloor();

		Parkingspot compact = new Compactspot(4);
		Parkingspot Large = new Largestspot(2);
		parkingfloor.setId(1);
		parkingfloor.addParkingSpot(compact);
		parkingfloor.addParkingSpot(Large);

		parkinglotService.addparkingFloor(parkingfloor);


		System.out.println("parking floor"
				+parkinglotService.getParkingFloor().get(0).getId()
				+"parking spot"+ parkinglotService.getParkingFloor()
		);



	}

}
