package com.example.demo.Controller;

import com.example.demo.Entity.EmployeeInformation;
import com.example.demo.Service.Emp_Info_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/fromController")
public class ControllerClass {

public ControllerClass(){}

    @RequestMapping("/hi")
    public String sayHI(){return "hi - From - Controller";}


    @Autowired
    Emp_Info_Services emp_info_services;

    @GetMapping("/all")
    public List<EmployeeInformation> getAllEmpInfo(){
        return emp_info_services.getAllInfo();
    }

    @GetMapping("/{id}")
    public EmployeeInformation findById(@PathVariable("id") int id ){
       return emp_info_services.findEmpById(id).orElseThrow();
    }

    @DeleteMapping("Delete/{id}")
    public void deleteEmpById(@PathVariable int id){
         emp_info_services.deleteById(id);
    }

    @PostMapping
    public EmployeeInformation addNewEmp(@RequestBody EmployeeInformation employeeInformation){
        return emp_info_services.save(employeeInformation);
    }


    @PutMapping("/{id}")
    public EmployeeInformation updateAllEmpInfoById
            (@RequestBody EmployeeInformation employeeInfo , @PathVariable("id") int id ){

        return emp_info_services.updateById(id) ;
    }






    //________________________________LIST_______________________________

    List<EmployeeInformation> employeeInformationList = new ArrayList<>(List.of(
            new EmployeeInformation("Sultan" , "Yasin" , "IT-Java" , "Värnamo-SveaVägen37 33150"),
            new EmployeeInformation("Sam" , "Andersson" , "IT-JavaScript" , "Värnamo 33150"),
            new EmployeeInformation("Svenne" , "Svensson" , "IT-C#" , "Värnamo-SveaVägen37 33150"),
            new EmployeeInformation("Carl" , "Carlson" , "IT-C++" , "Värnamo-SveaVägen37 33150"),
            new EmployeeInformation("David" , "Davidson" , "IT-Ruby" , "Värnamo-SveaVägen37 33150")
    ));


    @GetMapping("/fromList")
    public List<EmployeeInformation>  getAll(){
        return employeeInformationList;
    }

    @PostMapping("/add")
    public void addnew(@RequestBody EmployeeInformation employeeInformation){
        employeeInformationList.add(employeeInformation);
    }

    @RequestMapping(path="FirstName/{firstName}")
    public EmployeeInformation findByName(@PathVariable String firstName ){
        for (EmployeeInformation x : employeeInformationList) if (x.getFirstName().equals(firstName)  ) return x;
        return  null ;
    }



//  BeanUtils.copyProperties(employeeInfo , existingInfo , "id"); // this class is used to copy all properties from x to z
}
