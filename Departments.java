package com.example.my_self.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ahmed")
public class Departments {
    @Id
    @Column(name = "dept_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dept_id;
    @Column(name = "dept_name")
    private String dept_name;
    @Column(name = "employee")
    private int employee;
    @Column(name = "dept_location")
    private String dept_location;
    public Departments() {
    }
    public Departments(String dept_name, int numOfemployee, String dept_location) {
        this.dept_name = dept_name;
        employee = numOfemployee;
        this.dept_location = dept_location;
    }
    @Override
    public String toString() {
        return "Departments [dept_id=" + dept_id + ", dept_name=" + dept_name + ", NumOf_employee=" + employee
                + ", dept_location=" + dept_location + "]";
    }
    public int getDept_id() {
        return dept_id;
    }
    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
    public String getDept_name() {
        return dept_name;
    }
    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
    public int getNumOf_employee() {
        return employee;
    }
    public void setNumOf_employee(int numOfemployee) {
        employee = numOfemployee;
    }
    public String getDept_location() {
        return dept_location;
    }
    public void setDept_location(String dept_location) {
        this.dept_location = dept_location;
    }

}
