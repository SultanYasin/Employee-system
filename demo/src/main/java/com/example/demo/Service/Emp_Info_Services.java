package com.example.demo.Service;

import com.example.demo.Entity.EmployeeInformation;
import com.example.demo.Repository.EmpInfo_Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Emp_Info_Services {

    EmpInfo_Repository empInfo_repository;
    public Emp_Info_Services(EmpInfo_Repository empInfo_repository) {
        this.empInfo_repository = empInfo_repository;
    }


    public List<EmployeeInformation> getAllInfo() {
        return empInfo_repository.findAll();
    }


    public void deleteById(int id) {
        empInfo_repository.deleteById(id);
    }


    public void addNewEmployee(EmployeeInformation employeeInformation) {
        empInfo_repository.save(employeeInformation);
    }

    public EmployeeInformation save(EmployeeInformation employeeInformation) {
       return empInfo_repository.save(employeeInformation);
    }
}
