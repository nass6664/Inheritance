package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {

    public void doThis() {
        System.out.println("Executing a method - PS (Parent) doThis and I will execute first");
    }
    @BeforeMethod
    public void beforeRun(){
        System.out.println("Executing @BeforeMethod - in PS (Parent)   ");
    }

    @AfterMethod
    public void afterRun() {
        System.out.println("Executing @AfterMethod  - in PS (Parent)   ");
    }
}