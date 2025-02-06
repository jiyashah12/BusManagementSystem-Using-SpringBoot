package com.example.BusManagementSystem.controllers;

import com.example.BusManagementSystem.entities.Bus;
import com.example.BusManagementSystem.services.BookingService;
import com.example.BusManagementSystem.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private BusService busService;

    @GetMapping("/search/{source}/{destination}")
    public List<Bus> getBusByPreference(@PathVariable String source, @PathVariable String destination) {
        List<Bus> busByPref = bookingService.getBusByPreference(source, destination);
        return busByPref;
    }

    @PostMapping("/bookseats/{cust_id}/{date}/{bus_id}/{seats}")
    public ResponseEntity<String> booking(@PathVariable long cust_id, @PathVariable LocalDate date, @PathVariable long bus_id, @PathVariable String seats) {
        try {
            return bookingService.doBooking(cust_id, date, bus_id, seats);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error booking seats.");
        }

    }

    @DeleteMapping("/deletebooking/{booking_id}")
    public ResponseEntity<String> deletebooking(@PathVariable long booking_id) {
        bookingService.deleteBooking(booking_id);
        return ResponseEntity.ok("Booking deleted successfully.");
    }

    @DeleteMapping("/deleteallbookingsbyid")
    public ResponseEntity<String> deleteAllBookingsById(@PathVariable long booking_id) {
        try {
            bookingService.deleteAllBookingsById(booking_id);
            return ResponseEntity.ok("All Bookings deleted successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error deleting the bookings.");
        }
    }

}


