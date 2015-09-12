package com.company;

/**
 * Created by Mia on 2/26/2015.
 */
public class Group extends List {
    protected Person [] aPerson;
    protected int size;

    public Group() {
        System.out.println("Enter the maximum number of people in the group: ");
        this.aPerson = new Person[input.nextInt()];
        input.nextLine();
        for (int i = 0; i < this.aPerson.length; ++i)
            this.aPerson[i] = null;
        this.size = 0;
    }

    public void Build_List(){
        int i = 0;
        do{

            this.aPerson[i] = new Person();
            this.aPerson[i].getInput();
            ++i;
            System.out.println("Add another?");
        }while(i < this.aPerson.length && Again());
        this.size = i;
    }

    public void Display_List(){
        for (int i = 0; i < this.size; ++i){
            this.aPerson[i].displayPerson();
            System.out.println();
        }
    }

    public boolean Find(String match){
        for (int i = 0; i < this.size; ++i){
            if (this.aPerson[i].equals(match)){
                System.out.println("\nMatch to: ");
                this.aPerson[i].displayPerson();
                return true;
            }
        }
        return false;
    }

}
