package com.bridgelabz;
//
public class DailyWage {
            int wagePerHour = 20;
            int fullDayHour = 8;
            int dailyWage = 0;
            int employeeCheck = (int) Math.floor(Math.random()*10)%2;
// Constructor is Used
            DailyWage(){
                if (employeeCheck==1){
                    dailyWage = wagePerHour*fullDayHour;
                    System.out.println("Employee is Present DailyWage is " + dailyWage);
                }
                else {
                    System.out.println("Employee is Absent Daily wage is " + dailyWage);
                }
            }
        public static void main(String[] args) {
            System.out.println("Welcome To the Employee Wage Computation");
            DailyWage d=new com.bridgelabz.DailyWage(); // Calling a constructor
        }
}
