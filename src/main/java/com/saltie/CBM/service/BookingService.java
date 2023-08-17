package com.saltie.CBM.service;

import com.saltie.CBM.model.Booking;
import com.saltie.CBM.model.CreateCustomerBooking;

import java.util.List;

public interface BookingService {

    Booking viewBooking(Long id);

    List<Booking> viewBookings();

    List<Booking> viewBookingsByCustomerId(Long id);

    List<List<Booking>> viewBookingByCruiseName(String cruiseName);

    List<Booking> viewBookingByCruiseId(Long cruiseId);

    Booking addBooking(CreateCustomerBooking createCustomerBooking);

    Booking updateBooking(Booking booking);

    String removeBooking(Long id);
}
