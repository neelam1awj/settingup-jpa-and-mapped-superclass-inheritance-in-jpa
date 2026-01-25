package com.firstspringapplication.FirstSpringBootApplication.model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DriverReview extends Review{
     private String DriverReviewContent;
}
