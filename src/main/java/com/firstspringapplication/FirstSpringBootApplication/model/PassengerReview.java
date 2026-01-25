package com.firstspringapplication.FirstSpringBootApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class PassengerReview extends Review {

    @Column(nullable = false)//we can't inforce this not null constraint  because of inheritance strategy single table
    private String passengerReviewContent;
}
