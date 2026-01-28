package com.firstspringapplication.FirstSpringBootApplication.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student extends BaseModel {
    private String name;
    private String RollNo;
    @ManyToMany
    @JoinTable(//only one side should have this annotation
            name="cource_student",//join table name
            joinColumns = @JoinColumn(name="student_id"),//student is owning side
            inverseJoinColumns = @JoinColumn(name="cource_id")//couse is inverse side
    )// avaoid cascade.All in many to many because it may create issue like deleting a student may delete the cource also
    private List<Cource> cources=new ArrayList<>();
//if your join table needs extra fields then you need to create a separate entity for join table
}
