package com.firstspringapplication.FirstSpringBootApplication.repository;

import com.firstspringapplication.FirstSpringBootApplication.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver,Long> {
      Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

      @Query(nativeQuery = true, value = "SELECT * FROM driver WHERE id = :id AND license_number = :licenseNumber")
      Optional<Driver> rawFindByIdAndLicenseNumber(Long id, String licenseNumber);
}
