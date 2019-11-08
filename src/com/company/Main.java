
/*
   . create a class called Main
   . prompt the user
   . List out all the string files a user to enter
   . create declare boolean value and do with a  while loop
   . import the Scanner
*/
package com.company;


import java.util.ArrayList;
import java.util.Scanner;



public  class Main {



    public static void main(String[] args) {
        Scanner Z = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<>();
          employees.add("Betty");
        boolean Y;
        String PersonalInformation;
        String name ;
        String emailaddress ;
        String company ;
        String EXPERIANCE ;
        String jobtitle ;
        String startdate ;
        String enddate ;
        String jobdescription ;
        String cool;
        String d;

        boolean y = true;

              boolean list  = true;
        while (true){
            System.out.println("*********EMPLOYEE RESUME********** " );
            System.out.println("Do you want to add a resume ?"  );
            System.out.println("1.PERSONAL INFORMATION ");
           System.out.println(".name");
           name = Z.nextLine();
           System.out.println(".emailaddress");
           emailaddress = Z.nextLine();
           System.out.println ("2.EXPERIANCE");
           System.out.println(".company");
           company = Z.nextLine();
           System.out.println(".jobtitle");
           jobtitle = Z.nextLine();
           System.out.println(".startdate");
           startdate = Z.nextLine();
           System.out.println(".enddate");
           enddate = Z.nextLine();
           System.out.println(".jobdescription");
          jobdescription = Z.nextLine();

         System.out.println(name+emailaddress+company+jobtitle+startdate+enddate+jobdescription);




        }

    }



}

