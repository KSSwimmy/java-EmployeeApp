package com.lambdashool.employeeapp;

public class Employee //Employee class is case sensitive




{
  //fields - is the state of the object of a class. It is also the
    // Fields is also the information that we need to know. (adjectives)

    private static int maxId = 0; // static means that it will be shared across all Employees and it will have the same value
    private int id; // int is a base datatype and they are all lowercase
    private String fname; // String is a class (classes all start with an uppercase letter)
    private String lname;
    private double salary; // double is a base datatype that is used to handle numbers with a decimal.
    private boolean has401k;
    private int companyId;
    private int healthPlainId;





    // constructor - We know it's a constructor because there is no datatype
    // you can have multiple constructors, but the parameter list has to be unique

    public Employee(String fname, String lname, double salary, boolean has401k, int companyId, int healthPlainId)
    {
        maxId++; // increments maxId by 1. We're going to create a new employee.

        id = maxId;

        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401k = has401k;
        this.companyId = companyId;
        this.healthPlainId = healthPlainId;
    }





    // Getters and Setters - methods -behavors (verbs) What can the class do.

    //getters and setters
    public int getId()
    {
        return id;
    }

    public String getFname()
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public boolean isHas401k()
    {
        return has401k;
    }

    public void setHas401k(boolean has401k)
    {
        this.has401k = has401k;
    }

    public int getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(int companyId)
    {
        this.companyId = companyId;
    }

    public int getHealthPlainId()
    {
        return healthPlainId;
    }

    public void setHealthPlainId(int healthPlainId)
    {
        this.healthPlainId = healthPlainId;
    }





    // regular methods
    public String getName() // this method returns the first and last name
    {
        return fname + " " + lname;
    }

    public void giveRaise(double raise) // this method sends a percentage and increases the salary by that percentage's amount.
    {
        double raiseAmt;
        raiseAmt = salary * raise;
        salary = salary + raiseAmt;
    }
}
