package com.firstspringapplication.FirstSpringBootApplication.model;

public enum BookingStatus {
    SCHEDULED,
    CAB_ARRIVED,
    ASSIGNED,
    PENDING,
    CONFIRMED,
    CANCELLED,
    ASSIGNING_DRIVER,
    IN_RIDE,
    COMPLETED
}//to handle enum in db as string we need to add @Enumerated(EnumType.STRING) in the entity class or else it will be stored as ordinal value (0,1,2..)
