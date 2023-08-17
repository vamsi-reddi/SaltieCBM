package com.saltie.CBM.controller;

import com.saltie.CBM.model.Booking;
import com.saltie.CBM.model.CreateCustomerBooking;
import com.saltie.CBM.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @GetMapping("/welcome")
    public String Welcome() {
        return "welcome Vamsi";
    }

    @PostMapping("/welcomePost")
    public String welcome(){
        return "its working";
    }
    @GetMapping("/viewById/{id}")
    public Booking viewBooking(@PathVariable("id") Long id){
        return bookingService.viewBooking(id);
    }

    @GetMapping("/view")
    public List<Booking> viewBookings(){
        return bookingService.viewBookings();
    }
    @PostMapping("/create")
    public Booking createBooking(@RequestBody CreateCustomerBooking createCustomerBooking){
        return bookingService.addBooking(createCustomerBooking);
    }
    @PutMapping("/update")
    public Booking updateBooking(@RequestBody Booking booking){
        return bookingService.updateBooking(booking);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable("id") Long id) {
        return bookingService.removeBooking(id);
    }

    @GetMapping("/viewByCustomerId/{customerId}")
    public List<Booking> viewBookingByCustomerId(@PathVariable("customerId") Long customerId) {
        return bookingService.viewBookingsByCustomerId(customerId);
    }

    @GetMapping("/viewByCruiseName/{cruiseName}")
    public List<List<Booking>> viewBookingByCruiseName(@PathVariable("cruiseName") String cruiseName) {
        return bookingService.viewBookingByCruiseName(cruiseName);
    }

    @GetMapping("/viewByCruiseId/{cruiseId}")
    public List<Booking> viewBookingByCruiseId(@PathVariable("cruiseId") Long cruiseId) {
        return bookingService.viewBookingByCruiseId(cruiseId);
    }
}
