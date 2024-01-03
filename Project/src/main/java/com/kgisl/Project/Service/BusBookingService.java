package com.kgisl.Project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kgisl.Project.Entity.BusBookingForm;
@Service
public interface BusBookingService {

    List<BusBookingForm> getAllBookings();

    BusBookingForm createBooking(BusBookingForm bookingForm);

    BusBookingForm getBookingById(int id);

    BusBookingForm updateBooking(int id, BusBookingForm updatedBookingForm);

    void deleteBooking(int id);

    List<BusBookingForm> getBookingsByEmail(String email);
}
