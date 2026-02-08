package com.firstspringapplication.FirstSpringBootApplication.repository;

import com.firstspringapplication.FirstSpringBootApplication.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver,Long> {
      Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

      //you have to pass column name as it is in the database and not the variable name in the entity class


      //any error in this raw sql query will be detected at runtime and not at compile time and also the result of this query will be mapped to the entity class and if there is any error in the mapping then it will be detected at runtime and not at compile time
     //to resolve this issue we can use hibernate query language and in hibernate query language we can use the variable name in the entity class and not the column name in the database and also any error in the hibernate query will be detected at compile time and not at runtime and also the result of this query will be mapped to the entity class and if there is any error in the mapping then it will be detected at compile time and not at runtime
      @Query(nativeQuery = true, value = "SELECT * FROM driver WHERE id = :id AND licenseNumber = :licenseNumber")
      Optional<Driver> rawFindByIdAndLicenseNumber(Long id, String licenseNumber);


      //difference between raw and non-raw is that in raw we have to write the query by our self and in non raw and hibernate query language and hibernate will convert it to sql query and execute it and in raw we have to write the sql query by our self and execute it


      @Query("SELECT Driver from Driver WHERE id = :id AND d.licenseNumber = :ln")
      Optional<Driver> HqlFindByIdAndLicense(Long id, String ln);
}
