/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student {
    private int id;
    private String name;
    private Date dob;
    private double mark;

    public Student() {
    }

    public Student(int id, String name, Date dob, double mark) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", mark=" + mark + '}';
    }
    
    public String print(){
        return "Hello";
    }
    
    public void display(){
        System.out.println("Quang Lo");
    }
    public String addName()
    {
        return "Bachlo";
    }

}
