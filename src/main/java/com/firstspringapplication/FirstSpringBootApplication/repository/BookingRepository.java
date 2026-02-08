package com.firstspringapplication.FirstSpringBootApplication.repository;

import com.firstspringapplication.FirstSpringBootApplication.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findAllByDriverId(Long driverId);
}
