package com.example.CRUDOperationsDemo.model;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String studentName;
    private String studentUSN;
    private int studentAge;
    private int studentSem;
    private String studentClass;
    private LocalDate studentDOB;

}
