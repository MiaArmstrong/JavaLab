package com.company;

/**
 * Created by Mia on 2/19/2015.
 */
public class Person extends Tools {

    protected String name = new String();
    protected int age;
    protected float hourlyWage;
    protected String [] array;
    Grades grade = new Grades();

    public Person()
    {
        this.name = new String();
        this.age = 0;
        this.hourlyWage = 0;

    }

    public void getInput() {
        //System.out.println("\n\nEnter your name: ");
        //this.name = input.nextLine();
        //this.name = capFirst(this.name);

        //System.out.println("\nEnter your age: ");
        //age = input.nextInt();
        //input.nextLine();

        //System.out.println("\nEnter your hourly wage: ");
        //hourlyWage = input.nextFloat();
        //input.nextLine();

        grade.getGrades();

    }

    public void displayPerson() {
        System.out.println("\n\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Wage: $" + hourlyWage);
        grade.displayGrades();
    }

    public boolean equals(String source) {
        int match = 0;
        match = this.name.compareTo(source);
        if (match == 0)
            return true;
        else
            return false;
    }
}
