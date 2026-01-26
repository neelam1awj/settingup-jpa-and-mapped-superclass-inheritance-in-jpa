package com.firstspringapplication.FirstSpringBootApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Driver extends BaseModel{

    private String name;

    @Column(nullable = false, unique = true)
    private String licenseNumber;

    //1:M , driver has many bookings
    @OneToMany(mappedBy = "driver")//we used mappedBy to avoid creating extra table mappedBy vale should be same as the variable name in Booking class
    private List<Booking> bookings=new ArrayList<>();
}
