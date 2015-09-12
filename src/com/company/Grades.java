package com.company;

/**
 * Created by Mia on 2/26/2015.
 */
public class Grades extends Tools {

    int [] grades;
    int size;
    String gradeName[];


    public Grades(){
        this.grades = null;
        this.size = 0;

    }

    public void getSize(){
        System.out.println("Please enter the number of grades you have: ");
        size = input.nextInt();
        input.nextLine();
    }

    public void getGrades(){
        getSize();
        gradeName = new String[size];
        grades = new int[size];
        int i = 0;
        System.out.println("Please Enter the assignment or test names and grades.");
        for(i = 0; i < size; ++i){
            System.out.println("Name of assignment or test: ");
            gradeName[i] = input.nextLine();
            gradeName[i] = capFirst(gradeName[i]);
            System.out.println("Grade: ");
            grades[i] = input.nextInt();
            input.nextLine();
        }
    }

    public void displayGrades(){
        System.out.println("Grades: ");
        for(int i = 0; i < size; ++i){
            System.out.println(gradeName[i] + "  " + grades[i]);
        }
    }
}
