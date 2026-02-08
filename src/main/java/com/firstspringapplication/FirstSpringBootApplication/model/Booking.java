package com.firstspringapplication.FirstSpringBootApplication.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseModel{

    @OneToOne(cascade = {CascadeType.PERSIST},fetch = FetchType.LAZY)
    private Review driverReview;//we have set up one-to-one relationship between Booking and Review

    private Date startTime;
    private Date endTime;
    private Long TotalDistance;

    @Enumerated(value = EnumType.STRING)//Store enum as string in DB and @Enumeraated(value = EnumType.ORDINAL) to store as int
    //default is ORDINAL
    private BookingStatus bookingStatus;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;

    //if you want to use mongodb thatn use mongorepository and @Document annotation instead of @Entity and use @Id annotation for id field instead of @GeneratedValue
}
