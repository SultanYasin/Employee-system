package com.example.demo.Entity;

import lombok.*;

import javax.persistence.*;

@Entity//obj that can be stored in db
public class EmployeeInformation {



    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @Getter
    @Setter
    private String firstName;

    @Column
    @Getter
    @Setter
    private String lastName;

    @Column
    @Getter
    @Setter
    private String department;

    @Column
    @Getter
    @Setter
    private String fullAddress;

    public EmployeeInformation(String firstName, String lastName, String department, String fullAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.fullAddress = fullAddress;

    }

    public EmployeeInformation() {}



}
