package com.example.EmployeeInformation.Service;

import com.example.EmployeeInformation.Dto.EmployeeRequestDto;
import com.example.EmployeeInformation.Dto.EmployeeResponseDto;
import com.example.EmployeeInformation.Employee.EmployeeRepository;
import com.example.EmployeeInformation.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository repository;

    public List<EmployeeResponseDto> getDetails() {
        List<Employee> employee= repository.findAll();

        return employee.stream()
                .map(e -> new EmployeeResponseDto(
                        e.getId(),
                        e.getName(),
                        e.getAge(),
                        e.getSal()
                ))
                .toList();
    }

    public void addEmployee(EmployeeRequestDto employee) {
        Employee emp=new Employee();
        emp.setName(employee.getName());
        emp.setAge(employee.getAge());
        emp.setSal(employee.getSal());
        repository.save(emp);
    }
}
