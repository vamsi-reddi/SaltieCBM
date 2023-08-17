//package com.saltie.CBM.service;
//
//import com.saltie.CBM.model.*;
//import com.saltie.CBM.repository.CustomerBookingRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CustomerBookingServiceImpl implements CustomerBookingService{
//
//    @Autowired
//    CustomerService customerService;
//
//    @Autowired
//    CruiseService cruiseService;
//
//    @Autowired
//    BookingService bookingService;
//
//    @Autowired
//    CustomerBookingRepository customerBookingRepository;
//    @Override
//    public CustomerBooking viewCustomerBooking(Long id) {
//
//        return customerBookingRepository.findById(id).get();
//    }
//
//    @Override
//    public List<CustomerBooking> viewCustomerBookings() {
//
//        return customerBookingRepository.findAll();
//    }
//
//    @Override
//    public List<CustomerBooking> viewCustomerBookingByUser(Long userId) {
//        Customer customer = customerService.viewCustomer(userId);
//
//        return customerBookingRepository.findByCustomer(customer);
//    }
//
//    @Override
//    public CustomerBooking createCustomerBooking(CreateCustomerBooking createCustomerBooking) {
////        Customer customer = customerService.viewCustomer(createCustomerBooking.getCustomerId());
////        CustomerBooking customerBooking = new CustomerBooking();
////
////        customerBooking.setCustomer(customer);
////
////        Booking booking = new Booking();
////        booking.setBookingDate(createCustomerBooking.getDate());
////        booking.setStartLocation(createCustomerBooking.getStartPort());
////        booking.setNoOfPassengers(createCustomerBooking.getNoOfPassengers());
////        booking.setEndLocation(createCustomerBooking.getEndPort());
////
////
////        Cruise cruise = cruiseService.viewCruise(createCustomerBooking.getCruiseId());
////        cruise.setFreeSeats(cruise.getFreeSeats()-1);
////        cruiseService.updateCruise(cruise);
////        customerBooking.setCruise(cruise);
////
////        booking.setCruiseId(cruise.getCruiseId());
////        booking.setCruiseName(cruise.getCruiseName());
////
////        bookingService.addBooking(booking);
////        customerBooking.setBooking(booking);
////
////        customerBookingRepository.save(customerBooking);
//        return null;
//    }
//}
