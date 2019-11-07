package com.company;
/*
1.Build as an Object-Oriented Program
2.The main method of the program should handle all user interaction
3.The date must be kept in a type of collection (i.e. Arrays, or ArrayList)
4.Ensure that users have met the minimum amount of items requirements
5.Make the resume look pretty!
6. print out many jobs as the user want
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {

    public static void job(String[] args) {
        Scanner Z = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();


        employees.add(new Employee());
        Employee A = new Employee("Name A1", "Email address A2", "Company A3", "Job title A4", "Start date A5", "End date A6", "Job description A7");
        Employee B = new Employee("Name B1", "Email address B2", "Company B3", "Job title B4", "Start date B5", "End date B6", "Job description B7");
        employees.add(A);
        employees.add(B);
        String employee = null;
        System.out.println("Please enter the name of an employee A");
        String employeeA = Z.nextLine();

        System.out.println("Please enter the name of an employee B");
        String employeeB = Z.nextLine();


     }

    }

















