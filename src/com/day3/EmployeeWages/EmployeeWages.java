package com.day3.EmployeeWages;

public class EmployeeWages
{
    public static void main(String[] args)
    {
        System.out.println("Here is programs start check Employee Wages"); /* write a message for understanding*/
        int present=0, absent=1,perHoursSallary=20, workingHours=0, parttime=4;
        int check=(int) ((Math.random()*10)%3);
        if(check==present)
        {
            System.out.println("Employee was present");
            workingHours=8;
        }
        else if(check==parttime)
        {
            System.out.println("Employee was Part Time worker");
            workingHours=4;
        }
        else
        {
            System.out.println("Employee is Absent");
            workingHours=0;
        }
        int salary=perHoursSallary*workingHours;
        System.out.println("Employee working hours is = "+workingHours +"."+" And Daily wages is= "+salary);
    }
}
