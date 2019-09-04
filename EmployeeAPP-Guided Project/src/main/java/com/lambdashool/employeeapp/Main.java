package com.lambdashool.employeeapp;

public class Main
{
    public static void workWithData()
    {
        // when we make an object of the class (ex: Employee and Company) it's called instantiation
        // in the class' object's parameter the fields are listed in the order of each class' constructor (provided examples above each object)

        // HeathPlan's constructor - public HealthPlan(String name)
        HealthPlan h1 = new HealthPlan("My Health Plan 1");
        HealthPlan h2 = new HealthPlan("My Heath Plan 2");

        // Company's constructor - public Company(String name, int debt)
        Company c1 = new Company("Company A", 100);

        // Employee's constructor - public Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlainId)
        Employee epm1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
        Employee epm2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());

        System.out.println("*** Query Data ***");
        System.out.println();
    }

   //psvm (hotkey for "public static void main)
   public static void main(String[] args)
                                    //arguments
   {
        workWithData();
   }

   //testing//
}
