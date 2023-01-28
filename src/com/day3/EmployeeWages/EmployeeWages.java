package com.day3.EmployeeWages;

public class EmployeeWages
{
    public static void main(String[] args)
    {
        System.out.println("Here is programs start check Employee Wages"); /* write a message for understanding*/
        int present=0, absent=1;
        int check=(int) ((Math.random()*10)%2);
        if(check==present){
            System.out.println("present");
        }
        else {
            System.out.println("Absent");
        }
    }
}
