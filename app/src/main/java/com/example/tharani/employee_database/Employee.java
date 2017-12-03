package com.example.tharani.employee_database;
//import is libraries imported for writing the code
import android.graphics.Bitmap;

/**
 * Created by Tharani on 12/3/2017.
 */
//created class employee
public class Employee {
    //Declaring variables
    String empName;
    int empAge;
    Bitmap imageInByte;

    public Employee(String empName, int empAge, Bitmap imageInByte){ // Creating method
        // Giving reference to the objects using this keyword
        this.empName = empName;
        this.empAge = empAge;
        this.imageInByte = imageInByte;
    }

    // get() method for name
    public String getEmployeeName() {
        return empName;//returns empName
    }


    // get() method for age
    public int getEmployeeAge() {
        return empAge;//returns empAge
    }


    // get() method for image
    public Bitmap getimageInByte() {
        return imageInByte;//returns imageInByte
    }


}

