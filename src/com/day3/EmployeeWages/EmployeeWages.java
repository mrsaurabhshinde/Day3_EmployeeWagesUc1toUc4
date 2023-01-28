package com.day3.EmployeeWages;

public class EmployeeWages
{
    public static void main(String[] args)
    {
        System.out.println("Here is programs start check Employee Wages"); /* write a message for understanding*/
        int present=0, absent=1, perHoursSallary=20, workingHours=0;
        int check=(int) ((Math.random()*10)%3);
        if(check==present)
        {
            System.out.println("Employee was present");
            workingHours=8;
        }
        else
        {
            System.out.println("Employee was Absent");
            workingHours=0;
        }
        int salary=perHoursSallary*workingHours;
        System.out.println("employee Daily wages is=  "+salary);
    }
}
