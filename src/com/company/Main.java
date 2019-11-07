
/*
   . create a class called Main
   . prompt the user
   . List out all the string files a user to enter
   . create declare boolean value and do with a  while loop
   . import the Scanner
*/
package com.company;


import java.util.Scanner;

public  class Main {



    public static void main(String[] args) {
        Scanner Z = new Scanner(System.in);

        boolean Y;
        String name ;
        String emailaddress ;
        String company ;
        String jobtitle ;
        String startdate ;
        String enddate ;
        String jobdescription ;
        String d;

        System.out.println("EMPLOYEE RESUME " );
        boolean list  = true;
        while (list){
           System.out.println("Do you like to create a resume? ");
           System.out.println("name");
           name = Z.nextLine();
           System.out.println("emailaddress");
           emailaddress = Z.nextLine();
           System.out.println("company");
           company = Z.nextLine();
           System.out.println("jobtitle");
           company = Z.nextLine();
           System.out.println("startdate");
           company = Z.nextLine();
           System.out.println("enddate");
           company = Z.nextLine();
           System.out.println("jobdescription");
           company = Z.nextLine();
       }

    }



}

