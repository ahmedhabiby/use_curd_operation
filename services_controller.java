package com.example.my_self.Entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.my_self.services.services_interface;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/myself")
public class services_controller {
    private services_interface sInterface;

    public services_controller(services_interface sInterface) {
        this.sInterface = sInterface;
    }
    
    @GetMapping("/findalldepartments")
    public List<Departments> findall() {
       List<Departments>L1=sInterface.findAll();
       return L1;
    }

    @GetMapping("/findbyid/{emp_id}")
    Departments findById(@PathVariable int emp_id) {
       Departments d1=sInterface.findById(emp_id);
       return d1;
    }
    @PutMapping("/updatedepartments")
    void save(@RequestBody Departments d1) {
      sInterface.add(d1);
    }
    @DeleteMapping("/deletebyid/{emp_id}")
    void delete(@PathVariable int emp_id) {
        sInterface.delete(emp_id);
      }
    

}
