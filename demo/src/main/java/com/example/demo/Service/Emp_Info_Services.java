package com.example.demo.Service;

import com.example.demo.Entity.EmployeeInformation;
import com.example.demo.Repository.EmpInfo_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class Emp_Info_Services {


    EmpInfo_Repository empInfo_repository;
    public Emp_Info_Services(EmpInfo_Repository empInfo_repository) {
        this.empInfo_repository = empInfo_repository;
    }

    //@GetMapping("all")
    public List<EmployeeInformation> getAllInfo() {
        return empInfo_repository.findAll();
    }

    //GetMapping("/{id}")
    public Optional<EmployeeInformation> findEmpById(int id) {
        return  empInfo_repository.findById(id);
    }

    // @DeleteMapping("/{id}")
    public void deleteById(int id) {
        empInfo_repository.deleteById(id);
    }

    // @PostMapping
    public EmployeeInformation save(EmployeeInformation employeeInformation) {
       return empInfo_repository.save(employeeInformation);
    }

    //@PutMapping("/{id}")
    public EmployeeInformation updateById(int id) {

        //first, bring the employee that I want to change his/her info by getting the id.
     EmployeeInformation existingInfo = empInfo_repository.findById(id).orElseThrow();



        return null;
    }



}
