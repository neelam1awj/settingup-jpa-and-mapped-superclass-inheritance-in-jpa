package com.firstspringapplication.FirstSpringBootApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
    @OneToMany(mappedBy = "driver",fetch = FetchType.EAGER)//we used mappedBy to avoid creating extra table mappedBy vale should be same as the variable name in Booking class
    private List<Booking> bookings=new ArrayList<>();//fetchmode eager means when we fetch driver we also want to fetch all the bookings of that driver, by default it is lazy which means when we fetch driver we don't want to fetch all the bookings of that driver


    //Hibernate: select d1_0.id,d1_0.created_at,d1_0.license_number,d1_0.name,d1_0.updated_at,b1_0.driver_id,b1_0.id,b1_0.total_distance,b1_0.booking_status,b1_0.created_at,dr1_0.id,case when dr1_1.driver_review_id is not null then 1 when dr1_2.passenger_review_id is not null then 2 when dr1_0.id is not null then 0 end,dr1_0.content,dr1_0.created_at,dr1_0.rating,dr1_0.updated_at,dr1_1.driver_review_content,dr1_2.passenger_review_content,b1_0.end_time,p1_0.id,p1_0.created_at,p1_0.name,p1_0.updated_at,b1_0.start_time,b1_0.updated_at from driver d1_0 left join booking b1_0 on d1_0.id=b1_0.driver_id left join bookingreview dr1_0 on dr1_0.id=b1_0.driver_review_id left join driver_review dr1_1 on dr1_0.id=dr1_1.driver_review_id left join passenger_review dr1_2 on dr1_0.id=dr1_2.passenger_review_id left join passenger p1_0 on p1_0.id=b1_0.passenger_id where d1_0.id=?
}
