package com.bridgelabz;

class Calc{

    static void Calculate(){
        //UC6 calculating wages for total working hour in month
        int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int totalWorkingDays = 0;
        int totalHour = 0;
        int totalDailyWage = 0;

        while (totalHour < 100 && totalWorkingDays < 20) {
            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
            totalWorkingDays ++;

            switch (employeeCheck) {
                case 2:
                    totalHour =  totalHour + fullTimeHour;
                    totalDailyWage = totalDailyWage + fullTimeHour * wagePerHour;
                    System.out.println("Employee is present full time: " +totalDailyWage);
                    break;
                case 1:
                    totalHour =  totalHour + partTimeHour;
                    totalDailyWage = totalDailyWage + partTimeHour * wagePerHour;
                    System.out.println("Employee is present half time: " +totalDailyWage);
                    break;
                default:
                    System.out.println("Employee is absent: " +totalDailyWage);
            }
            System.out.println("Working Days is: " +totalWorkingDays+ " Hours: " +totalHour);
        }
        System.out.println("Employee total wage for month is: " +totalDailyWage);
    }
}


public class WagesForTotalHour extends Calc{
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Calc.Calculate();
    }

}
