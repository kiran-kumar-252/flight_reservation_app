package com.flight_reservation_app.service;

import com.flight_reservation_app.dto.ReservationReqeust;
import com.flight_reservation_app.entity.Reservation;

public interface ReservationService {
	Reservation bookFlight(ReservationReqeust request);

}
