package com.employeewage;

    public class EmployeePresentOrAbsent {
        public static void main(String[] args) {

            //Declaring the variables.
            double isPresent = 1;
            double randomCheck = (double)Math.floor((Math.random()*10)%2);

            //Checking if the Employee is present!!!
            if (randomCheck == isPresent)
            {
                System.out.println("Employee is present");
            }
            else
            {
                System.out.println("Employee is absent");
            }
        }
    }


