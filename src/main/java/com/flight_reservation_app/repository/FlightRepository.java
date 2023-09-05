package com.flight_reservation_app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight_reservation_app.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Flight> findFlights(@Param("departureCity") String from,@Param("arrivalCity") String to,@Param("dateOfDeparture") Date departureDate);	//the data which comes from controller layer to method arguments like 'from' and 'to' gets copied to respective names like 'departure city' and 'arrival city' with the help of "@Param". 

}
