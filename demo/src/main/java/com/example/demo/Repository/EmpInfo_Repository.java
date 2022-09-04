package com.example.demo.Repository;

import com.example.demo.Entity.EmployeeInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpInfo_Repository extends JpaRepository<EmployeeInformation , Integer> {
    //I have to use Integer because the id for the class that will be stored is of the Integer type
}
