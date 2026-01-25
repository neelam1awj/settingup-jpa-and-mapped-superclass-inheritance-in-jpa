package com.firstspringapplication.FirstSpringBootApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class PassengerReview extends Review {
    private String passengerReviewContent;
}
