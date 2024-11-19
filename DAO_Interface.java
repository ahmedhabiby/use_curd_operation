package com.example.my_self.DAO;

import java.util.List;

import com.example.my_self.Entity.Departments;

public interface DAO_Interface {
    List<Departments> findAll();
    Departments findById(int id);
    void delete(int id);
    void add(Departments d1);
}
