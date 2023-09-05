package com.flight_reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight_reservation_app.dto.ReservationReqeust;
import com.flight_reservation_app.entity.Reservation;
import com.flight_reservation_app.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationReqeust request,ModelMap modelMap) {		//Here 'ReservationRequest' is the dto class and 'request' is it's object.
		Reservation reservationId = reservationService.bookFlight(request);
		modelMap.addAttribute("reservationId",reservationId.getId());
		return"confirmReservation";
	}
}
