package com.firstspringapplication.FirstSpringBootApplication.model;

import jakarta.persistence.*;
import lombok.*;

@Entity//if we add name inside entity like @Entity(name="review_table") then the table will be created with name review_table but priority is given to @Table annotation if both are present
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bookingreview")
@Inheritance(strategy = InheritanceType.JOINED)//reduce redundancy by creating separate table for common columns only property of base class will be stored in base table and child class properties will be stored in separate table with foreign key relation to base table primary key
public class Review extends BaseModel {
    @Column(nullable = false)
    private String content;

    Double rating;

    @Override
    public String toString() {
        return "ToDo{" +
                "rating=" + rating +
                "updatedAt=" + updatedAt +
                "createdAt=" + createdAt +
                '}';
    }
}
