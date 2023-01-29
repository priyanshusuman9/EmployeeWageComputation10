package com.bridgelabz;
import java.util.Random;
public class EmployeeWageMultipleCompany {
    final static int FULL_TIME_WORKER = 1;
    final static int PART_TIME_WORKER = 2;
    public static void computeEmpWage(String company, int EMP_RATE_PER_HOUR, int Total_no_Working_Day, int EMP_TOTAL_HOURS) {
        int totalworkingdays = 0;
        int empHours = 0;
        int empWage = 0;
        int Totalemphrs = 0;
        System.out.println("Welcome to Employee Wage Program");
        int Total_emp_wage = 0;
        while (Totalemphrs <= EMP_TOTAL_HOURS && totalworkingdays <= Total_no_Working_Day) {
            totalworkingdays++;
            Random random = new Random();

            int empCheck = random.nextInt(2);
            switch (empCheck) {
                case FULL_TIME_WORKER:
                    empHours = 8;

                    break;
                case PART_TIME_WORKER:
                    empHours = 4;

                    break;
                default:
                    empHours = 0;
            }
            Totalemphrs = Totalemphrs + empHours;
            empWage = empHours * EMP_RATE_PER_HOUR;
            System.out.println("Daily emp wage is"+empWage);
            Total_emp_wage = empWage + Totalemphrs;
            Total_emp_wage = Total_emp_wage * Total_no_Working_Day;
        }
        System.out.println("The Monthly Wage of Employee of " + company + " is" + Total_emp_wage);
    }
    public static void main(String[] args) {
        System.out.println("First Company");
        computeEmpWage("Dynamic Trading", 15, 22, 10);
        System.out.println("Second Company");
        computeEmpWage("IBM", 20, 25, 200);
        System.out.println("Third Company");
        computeEmpWage("INFOSYS", 50, 30, 250);
        System.out.println("********************************");

    }
}

