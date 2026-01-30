package com.bridgelabz.employeewage;

public class EmployeeWageComputation {
    public static int IS_FULL_TIME = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int isEmployeePresent = getEmployeePresence();
        if (isEmployeePresent == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    private static int getEmployeePresence() {
        return (int) (Math.random() * 2);
    }
}
