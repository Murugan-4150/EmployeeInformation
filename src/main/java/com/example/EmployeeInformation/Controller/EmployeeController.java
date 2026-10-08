package com.example.EmployeeInformation.Controller;


import com.example.EmployeeInformation.Dto.EmployeeRequestDto;
import com.example.EmployeeInformation.Dto.EmployeeResponseDto;
import com.example.EmployeeInformation.Entity.Employee;
import com.example.EmployeeInformation.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    public EmployeeService service;

    @GetMapping("/EmployeeDetails")
    public List<EmployeeResponseDto> getEmployeeDetails(){
        return service.getDetails();
    }

    @PostMapping("/AddEmployee")
    public void addEmployeeDetails(@RequestBody EmployeeRequestDto employee){
        service.addEmployee(employee);
    }

}
