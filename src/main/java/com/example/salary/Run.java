package com.example.salary;

import org.springframework.boot.SpringApplication;



public class Run {
    public static void main(String[] args) {
        // SpringApplication.run(SalaryApplication.class, args);
        SalaryApplication.registerName();
        double result=SalaryApplication.salary(10,121);
        System.out.println("This is the amount of money that you make in year "+" ");
        System.out.println((int)result);
    }
}
