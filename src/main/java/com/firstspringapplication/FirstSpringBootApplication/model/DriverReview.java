package com.firstspringapplication.FirstSpringBootApplication.model;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "driver_review_id")//sets up  name the primary key join column for the inheritance
public class DriverReview extends Review{
     private String DriverReviewContent;
}
