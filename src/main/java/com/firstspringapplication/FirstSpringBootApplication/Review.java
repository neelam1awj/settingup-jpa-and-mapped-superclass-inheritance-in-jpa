package com.firstspringapplication.FirstSpringBootApplication;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="todos")
public class Review extends BaseModel {


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