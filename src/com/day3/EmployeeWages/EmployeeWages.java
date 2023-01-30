package com.day3.EmployeeWages;

public class EmployeeWages
{
    public static void main(String[] args)
    {
        System.out.println("Here is programs start check Employee Wages"); /* write a message for understanding*/
        int present=1, absent=3,perHoursSallary=20, workingHours=0, parttime=2;
        int check=(int) ((Math.random()*10)%3);
        switch (check)
        {
            case 1:
                System.out.println("Employee is present");
                workingHours=8;
                break;
            case 2:
                System.out.println("Employee is parttime Employee");
                workingHours=4;
                break;
            default:
                System.out.println("Employee is absent");
                workingHours=0;
                break;
        }
        int salary=perHoursSallary*workingHours;
        System.out.println("Employee working hours is = "+workingHours +"."+" And Daily wages is= "+salary);
    }
}
