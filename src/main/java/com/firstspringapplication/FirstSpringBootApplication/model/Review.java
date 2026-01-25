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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)//everthing is same as @MappedSuperclass but here we can create a table for parent class as well adn on primary key generation strategy we have options like TABLE for table per class strategy
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
//issue with table per class strategy is that if we have 4 child classes then common columns will be repeated 4 times in database leading to redundancy