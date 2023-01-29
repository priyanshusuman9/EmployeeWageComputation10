package com.bridgelabz;

public class PartTimeWage {

    PartTimeWage(int wagePerHour, int fullDayHour, int partTimeWage, int dailyWage){

        int employeeCheck = (int)(Math.random() * ((2 + 0) + 1));
        if (employeeCheck==2) {
            dailyWage=fullDayHour*wagePerHour;
            System.out.println("Employee is Present Full Time wage is " + " " + dailyWage);
        } else if (employeeCheck==1){
            dailyWage=partTimeWage*wagePerHour;
            System.out.println("Employee is Present Half Time wage is " + " " + dailyWage);
        }
        else {
            System.out.println("Employee is Absent wage is " + " " + dailyWage);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To the Employee Wage Computation");
       PartTimeWage p=new PartTimeWage(20,8,4,0);
    }
}
