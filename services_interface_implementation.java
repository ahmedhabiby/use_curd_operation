package com.example.my_self.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.my_self.DAO.DAO_Interface;
import com.example.my_self.Entity.Departments;


@Service
public class services_interface_implementation implements services_interface {
private DAO_Interface DAO_Interface1;

    public services_interface_implementation(DAO_Interface dAO_Interface1) {
    DAO_Interface1 = dAO_Interface1;
}

    @Override
    public List<Departments> findAll() {
       List<Departments> l1=DAO_Interface1.findAll();
       return l1;
    }

    @Override
    public Departments findById(int id) {
        return DAO_Interface1.findById(id);
    }

    @Override
    public void delete(int id) {
         DAO_Interface1.delete(id);
    }

    @Override
    public void add(Departments d1) {
        DAO_Interface1.add(d1);
    }

}
