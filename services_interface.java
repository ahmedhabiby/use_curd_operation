package com.example.my_self.services;

import java.util.List;

import com.example.my_self.Entity.Departments;

public interface services_interface {
 List<Departments> findAll();
    Departments findById(int id);
    void delete(int id);
    void add(Departments d1);

}
