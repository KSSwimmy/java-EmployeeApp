package com.lambdashool.employeeapp;

public class Company
{
    private static int maxId = 0;

    // when the fields are made public, getters and setters aren't needed.
    // BUT when there aren't any getters and setters you lose control that is why it's considered bad programming practice.

    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt)
    {
        maxId++;
        this.id = maxId;

        this.name = name;
        this.debt = debt;
    }
}
