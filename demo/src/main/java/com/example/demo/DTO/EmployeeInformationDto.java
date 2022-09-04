package com.example.demo.DTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeInformationDto implements Serializable {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String department;
    private final String fullAddress;
}
