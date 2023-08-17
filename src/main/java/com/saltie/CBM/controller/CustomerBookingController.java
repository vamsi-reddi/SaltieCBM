//package com.saltie.CBM.controller;
//
//import com.saltie.CBM.model.CreateCustomerBooking;
//import com.saltie.CBM.model.CustomerBooking;
//import com.saltie.CBM.service.CustomerBookingService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/customerBooking")
//public class CustomerBookingController {
//    @Autowired
//    CustomerBookingService customerBookingService;
//    @GetMapping("/viewById/{id}")
//    public CustomerBooking viewCustomerBooking(@PathVariable("id") Long id) {
//        return customerBookingService.viewCustomerBooking(id);
//    }
//
//    @GetMapping("/view")
//    public List<CustomerBooking> viewCustomerBookings() {
//        return customerBookingService.viewCustomerBookings();
//    }
//
//    @GetMapping("/viewByUser/{id}")
//    public List<CustomerBooking> viewCustomerBookingByUser(@PathVariable("id") Long id) {
//        return customerBookingService.viewCustomerBookingByUser(id);
//    }
//
//    @PostMapping("/create")
//    public CustomerBooking createBooking(@RequestBody CreateCustomerBooking createCustomerBooking) {
//        return customerBookingService.createCustomerBooking(createCustomerBooking);
//    }
//}
