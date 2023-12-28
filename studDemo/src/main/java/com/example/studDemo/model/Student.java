package com.example.studDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rollNo;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="fees_paid")
    private boolean feesPaid;

    //zero-arg constructor
    public Student() {
    }

    //parameterized constructor
    public Student(long rollNo, String name, String address, boolean feesPaid) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.feesPaid = feesPaid;
    }

    
    //Getter and Setter methods...
    public long getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFeesPaid() {
        return feesPaid;
    }

    // Setter methods
    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFeesPaid(boolean feesPaid) {
        this.feesPaid = feesPaid;
    }

    //toString() method
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", feesPaid=" + feesPaid + "]";
    }

   
}
