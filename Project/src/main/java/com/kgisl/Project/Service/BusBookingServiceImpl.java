package com.kgisl.Project.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.Project.Entity.BusBookingForm;
import com.kgisl.Project.Repository.BusBookingRepository;

import java.util.List;

@Service
public class BusBookingServiceImpl implements BusBookingService {

    @Autowired
    private BusBookingRepository busBookingRepository;

    @Override
    public List<BusBookingForm> getAllBookings() {
        return busBookingRepository.findAll();
    }

    @Override
    public BusBookingForm createBooking(BusBookingForm bookingForm) {
        return busBookingRepository.save(bookingForm);
    }

    @Override
    public BusBookingForm getBookingById(int id) {
        return busBookingRepository.findById(id).orElse(null);
    }

    @Override
    public BusBookingForm updateBooking(int id, BusBookingForm updatedBookingForm) {
        BusBookingForm existingBooking = getBookingById(id);
        if (existingBooking != null) {
            // Update the fields as needed
            existingBooking.setFirstName(updatedBookingForm.getFirstName());
            existingBooking.setLastName(updatedBookingForm.getLastName());
            existingBooking.setEmailId(updatedBookingForm.getEmailId());
            existingBooking.setContactNumber(updatedBookingForm.getContactNumber());
            existingBooking.setGender(updatedBookingForm.getGender());
            existingBooking.setAge(updatedBookingForm.getAge());
            existingBooking.setIdentityProof(updatedBookingForm.getIdentityProof());
            existingBooking.setIdNumber(updatedBookingForm.getIdNumber());
            existingBooking.setBoardingPointLocation(updatedBookingForm.getBoardingPointLocation());
            existingBooking.setStartDateAndTime(updatedBookingForm.getStartDateAndTime());
            existingBooking.setDroppingPoint(updatedBookingForm.getDroppingPoint());
            existingBooking.setSeatPreference(updatedBookingForm.getSeatPreference());
            existingBooking.setPaymentMethod(updatedBookingForm.getPaymentMethod());

            return busBookingRepository.save(existingBooking);
        }
        return null;
    }

    @Override
    public void deleteBooking(int id) {
        busBookingRepository.deleteById(id);
    }

    @Override
    public List<BusBookingForm> getBookingsByEmail(String email) {
        return busBookingRepository.findByEmailId(email);
    }
}

