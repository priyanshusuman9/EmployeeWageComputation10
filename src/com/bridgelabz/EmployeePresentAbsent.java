package com.bridgelabz;

class PresentAbsent{
    // This package is used for takeing random numbers
    int employeeCheck = (int) Math.floor(Math.random()*10)%2;

    void Attendence(){
        // Comdition For check Employee is Present or Absent
        if (employeeCheck==1){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }

    }

}

public class EmployeePresentAbsent extends PresentAbsent {
    public static void main(String[] args) {
        PresentAbsent p=new PresentAbsent();
        p.Attendence();
    }

}
