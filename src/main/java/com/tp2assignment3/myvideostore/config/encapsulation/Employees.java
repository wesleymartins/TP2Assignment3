/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2assignment3.myvideostore.config.encapsulation;

/**
 *
 * @author student
 */
public class Employees {
    
    private String Name;
    private String Surname;
    private float Salary;
    
    public void setName(String n)
    {
        Name = n;
    }
    
    public void setSurname(String s)
    {
        Surname = s;
    }
    
    public void setSalary(float sal)
    {
        Salary = sal;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getSurname()
    {
        return Surname;
    }
    
    public float getSalary()
    {
        return Salary;
    }
    
    
    
    
}
