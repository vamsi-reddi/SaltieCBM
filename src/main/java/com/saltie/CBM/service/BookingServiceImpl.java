package com.saltie.CBM.service;

import com.saltie.CBM.model.*;
import com.saltie.CBM.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    BookingRepository bookingRepository;

//    @Autowired
//    CustomerBookingService customerBookingService;

    @Autowired
    CustomerService customerService;

    @Autowired
    CruiseService cruiseService;

    @Override
    public Booking viewBooking(Long id) {
        return bookingRepository.findById(id).get();
    }

    @Override
    public List<Booking> viewBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public List<Booking> viewBookingsByCustomerId(Long customerId) {
        //Customer customer = customerService.viewCustomer(customerId);

        return bookingRepository.findAllByCustomerId(customerId);
    }

    @Override
    public List<List<Booking>> viewBookingByCruiseName(String cruiseName) {

        List<List<Booking>> bookingList1 = bookingRepository.findAllByCruiseCruiseName(cruiseName);


        return bookingList1;
    }

    @Override
    public List<Booking> viewBookingByCruiseId(Long cruiseId) {
        //Cruise cruise = cruiseService.viewCruise(cruiseId);

        return bookingRepository.findAllByCruiseCruiseId(cruiseId);
    }


    @Override
    public Booking addBooking(CreateCustomerBooking createCustomerBooking) {

        Customer customer = customerService.viewCustomer(createCustomerBooking.getCustomerId());


        Booking booking = new Booking();
        booking.setBookingDate(createCustomerBooking.getDate());
        booking.setStartLocation(createCustomerBooking.getStartPort());
        booking.setNoOfPassengers(createCustomerBooking.getNoOfPassengers());
        booking.setEndLocation(createCustomerBooking.getEndPort());


        Cruise cruise = cruiseService.viewCruise(createCustomerBooking.getCruiseId());
        cruise.setFreeSeats(cruise.getFreeSeats()-1);
        cruiseService.updateCruise(cruise);

        booking.setCustomer(customer);
        booking.setCruise(cruise);

        return bookingRepository.save(booking);
    }

    @Override
    public Booking updateBooking(Booking booking) {
        if(bookingRepository.findById(booking.getBookingId()).isPresent()){
            Booking booking1 = bookingRepository.findById(booking.getBookingId()).get();
            booking1.setBookingDate(booking.getBookingDate());
            booking1.setEndLocation(booking.getEndLocation());
            booking1.setStartLocation(booking.getStartLocation());
            booking1.setNoOfPassengers(booking.getNoOfPassengers());
            booking1.setCruise(booking.getCruise());
            booking1.setCustomer(booking.getCustomer());
            return bookingRepository.save(booking);
        }
        return null;
    }

    @Override
    public String removeBooking(Long id) {
        if (bookingRepository.findById(id).isPresent()){
            bookingRepository.deleteById(id);
            return "removed successfully";
        }
        return "record not exist";
    }
}
