/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2assignment3.myvideostore;

import com.tp2assignment3.myvideostore.config.DIP.Violation.betterStoreClerk;
import com.tp2assignment3.myvideostore.config.encapsulation.Employees;
import com.tp2assignment3.myvideostore.config.inheritence.Employee;
import com.tp2assignment3.myvideostore.config.inheritence.StoreClerk;
import com.tp2assignment3.myvideostore.config.polymorphism.Manager;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class myVideoStoreTest {
    
    public static Employee service;
    public static StoreClerk inherService;
    public static Manager polyService;
   
    
    
    public myVideoStoreTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void encapsTest() 
     {
         service.setName("Wesley");
         Assert.assertEquals(service.getName(), "Wesley", "Employee Name: ");
     }
     
     @Test
     public void inherTest() 
     {
         inherService.setName("John");
         Assert.assertEquals(inherService.getName(), "John", "Store Clerk Name: ");
     }
     
     @Test
     public void polyTest() 
     {
         
        Assert.assertEquals(polyService.hours(), 8, "Hours of work:  ");
     }
     
     
     

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        service = new Employee();
        inherService = new StoreClerk();
        polyService = new Manager();
       
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
