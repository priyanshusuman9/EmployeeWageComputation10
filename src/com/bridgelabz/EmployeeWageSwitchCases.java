package com.bridgelabz;

// Inheritance Concepts is Used
class SwitchCase{
    void UsingSwitchCase(){ // Used a non Static method to Calculate PArt time and Full Time Wage
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeWage = 4;
        int dailyWage = 0;
        int employeeCheck = (int)(Math.random() * ((2 + 0) + 1));
        // By using Switch Case we can check full time and Part time Wage
        switch (employeeCheck){
            case 1:
                dailyWage= fullDayHour*wagePerHour;
                System.out.println("Employee Full Time Wage is " +" "+ dailyWage);
                break;
            case 2:
                dailyWage=partTimeWage*wagePerHour;
                System.out.println("Employee Part Time Wage is " + " "+ dailyWage);
                break;
            default:
                System.out.println( "Employee is Absent Daily Wage is " + " " + dailyWage);
        }
    }
}

public class EmployeeWageSwitchCases extends SwitchCase {
    public static void main(String[] args) {
        System.out.println("Welcome To the Employee Wage Computation");
        SwitchCase s=new SwitchCase(); // Call a non static method in the static main method
        s.UsingSwitchCase();
    }
}
