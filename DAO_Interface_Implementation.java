package com.example.my_self.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.my_self.Entity.Departments;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class DAO_Interface_Implementation implements DAO_Interface {
    private EntityManager entitymanager;

    public DAO_Interface_Implementation(EntityManager entitymanager) {
        this.entitymanager = entitymanager;
    }

    @Override
    public List<Departments> findAll() {
        TypedQuery <Departments> q1=entitymanager.createQuery("from Departments",Departments.class);
        List<Departments> l1=q1.getResultList();
        return l1;
    }

    @Override
    public Departments findById(int id) {
        return entitymanager.find(Departments.class, id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Departments d1=entitymanager.find(Departments.class,id);
        entitymanager.remove(d1);
    }

    @Override
    @Transactional
    public void add(Departments d1) {
       entitymanager.merge(d1);
    }
    

}
