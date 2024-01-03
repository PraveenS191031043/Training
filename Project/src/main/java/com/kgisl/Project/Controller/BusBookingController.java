package com.kgisl.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kgisl.Project.Entity.BusBookingForm;
import com.kgisl.Project.Service.BusBookingService;

import java.util.List;

@RestController
@RequestMapping("/api/bus-bookings")
@CrossOrigin("http://localhost:4200")
public class BusBookingController {

    @Autowired
    private BusBookingService busBookingService;

    @GetMapping
    public ResponseEntity<List<BusBookingForm>> getAllBookings() {
        List<BusBookingForm> bookings = busBookingService.getAllBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusBookingForm> getBookingById(@PathVariable int id) {
        BusBookingForm booking = busBookingService.getBookingById(id);
        if (booking != null) {
            return new ResponseEntity<>(booking, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<BusBookingForm> createBooking(@RequestBody BusBookingForm bookingForm) {
        BusBookingForm createdBooking = busBookingService.createBooking(bookingForm);
        return new ResponseEntity<>(createdBooking, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BusBookingForm> updateBooking(@PathVariable int id, @RequestBody BusBookingForm updatedBookingForm) {
        BusBookingForm updatedBooking = busBookingService.updateBooking(id, updatedBookingForm);
        if (updatedBooking != null) {
            return new ResponseEntity<>(updatedBooking, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable int id) {
        busBookingService.deleteBooking(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/by-email")
    public ResponseEntity<List<BusBookingForm>> getBookingsByEmail(@RequestParam String email) {
        List<BusBookingForm> bookings = busBookingService.getBookingsByEmail(email);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }
}
