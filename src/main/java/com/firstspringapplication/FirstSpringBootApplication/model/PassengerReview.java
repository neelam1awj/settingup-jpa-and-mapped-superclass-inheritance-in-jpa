package com.firstspringapplication.FirstSpringBootApplication.model;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@PrimaryKeyJoinColumn(name = "passenger_review_id")// Specify the primary key column name for the joined table
public class PassengerReview extends Review {
    private String passengerReviewContent;
    private String passengerRating;
}
