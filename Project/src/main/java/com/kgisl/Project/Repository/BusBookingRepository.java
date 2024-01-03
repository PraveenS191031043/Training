package com.kgisl.Project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.Project.Entity.BusBookingForm;

public interface BusBookingRepository extends JpaRepository<BusBookingForm, Integer> {

    List<BusBookingForm> findByEmailId(String email);

}