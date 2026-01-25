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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//whenever you want to get all reviews including child classes reviews in one go then use SINGLE_TABLE strategy
public class Review extends BaseModel {// you don't have to use the join to fetch the data of parent and child class but table become overall bulky if there are many child classes


    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double date;

    Double rating;



    @Override
    public String toString() {
        return "ToDo{" +
                "rating=" + rating +
                "title=" + title +
                "updatedAt=" + updatedAt +
                "createdAt=" + createdAt +
                "date=" + date +
                "description=" + description +
                '}';
    }
}
//5️⃣ Visual analogy (easy to remember)
//
//Think of CCTV cameras 📹
//
//@EnableJpaAuditing → Turns CCTV system ON
//
//@EntityListeners → Installs camera in a specific room
//
//@CreatedDate / @LastModifiedDate → Timestamps in footage
//
//No power ❌ → no recording
//No camera ❌ → no footage


//6️⃣ If you remove BOTH annotations
//@EnableJpaAuditing ❌
//@EntityListeners ❌
//
//
//Then you must manually do this:
//
//        toDo.setCreatedAt(LocalDateTime.now());
//        toDo.setUpdatedAt(LocalDateTime.now());
//
//
//Every.
//        Single.
//        Time.