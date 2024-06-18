//package com.datajpa.entities;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Emp {
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    private int id;
//    private String empName;
//    @OneToOne
//    private Mobile mobile;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }
//
//    public Mobile getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(Mobile mobile) {
//        this.mobile = mobile;
//    }
//}
