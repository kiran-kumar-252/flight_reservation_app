package com.flight_reservation_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_reservation_app.dto.ReservationReqeust;
import com.flight_reservation_app.entity.Flight;
import com.flight_reservation_app.entity.Passenger;
import com.flight_reservation_app.entity.Reservation;
import com.flight_reservation_app.repository.FlightRepository;
import com.flight_reservation_app.repository.PassengerRepository;
import com.flight_reservation_app.repository.ReservationRepository;
import com.flight_reservation_app.utilities.EmailUtil;
import com.flight_reservation_app.utilities.PdfGenerator;

@Service		//we need to use this annotation to specify this layer as a service layer.
public class ReservationServiceImpl implements ReservationService {
	
	
	
	@Autowired
	PassengerRepository passengerRepo;
	
	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	ReservationRepository reservationRepo;
	
	@Autowired
	PdfGenerator pdfGenerator;
	
	@Autowired
	EmailUtil emailUtil;
	
	@Override
	public Reservation bookFlight(ReservationReqeust request) {
		
		
		
		Passenger passenger=new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddelName(request.getMiddelName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		Reservation reservation=new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		String filePath="C:\\sts version 4.17\\flight_reservation_app\\tickets\\reservation"+reservation.getId()+".pdf";
		reservationRepo.save(reservation);
		
		pdfGenerator.generateItinerary(reservation,filePath);
		emailUtil.sendItinerary(passenger.getEmail(),filePath);
		
		return reservation;
		
		
	}

}
