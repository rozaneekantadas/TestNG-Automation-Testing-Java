/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Asus
 */
public class GroupsDemoTest {
    
    @Test(priority=1, groups="regression")
    public void bloginTest(){
        System.out.println("Login is successful");
    }
    
    @Test(priority=2, groups="regression")
    public void alogoutTest(){
        System.out.println("Logout is successful");
    }
    
    @Test(groups="regression")
    public void csignupTest(){
        System.out.println("Signup is successful");
    }
    
    @Test(groups= {"regression", "bvt"})
    public void bTest1(){
        System.out.println("Test1");
    }
    
    @Test(groups="bvt")
    public void bTest2(){
        System.out.println("Test2");
    }
}
