package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class EmployeeController
{
   @RequestMapping("/employees")
    public List<Employee> getEmployees()
    {
      List<Employee> employeesList = new ArrayList<Employee>();
      employeesList.add(new Employee(1,"fritzie","alex","mavis.alex.37@gmail.com"));
      return employeesList;
    }
}