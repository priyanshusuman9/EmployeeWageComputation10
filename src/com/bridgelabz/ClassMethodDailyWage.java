package com.bridgelabz;

class EmployeeDailyWage{
    // By  creating non static method in the same class
    static void CountDailyWage(){
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = 0;
        int employeeCheck = (int) Math.floor(Math.random()*10)%2;
        if (employeeCheck==1){
            dailyWage = wagePerHour*fullDayHour;
            System.out.println("dailyWage is " + dailyWage);
        }
        else {
            System.out.println("Employee is Absent Daily wage is " + dailyWage);
        }
    }
}
// Using Different Class Static Method Compute Daily Wage

public class ClassMethodDailyWage {
    public static void main(String[] args) {
        EmployeeDailyWage.CountDailyWage();
    }
}
