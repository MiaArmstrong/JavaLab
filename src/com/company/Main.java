package com.company;


public class Main extends Tools {


    public static void main(String[] args) {
        System.out.println("Welcome to CS202's Java Workshop\n" + "Enjoy!");

        //List allPeople = new Group();
        //allPeople.Build_List();
       // allPeople.Display_List();

       // System.out.println("Repeat for LLL: ");
       // allPeople = new Linked_List();
        //allPeople.Build_List();
        //allPeople.Display_List();
        //allPeople.Find("Mia");

        Linked_List morePeople = new Linked_List();
        morePeople.Build_List();
        morePeople.Display_List();
        //int total = morePeople.num_times();
        //System.out.println("The last item on the list is found " + total + " times in the list.");

        int num = morePeople.remove_first_last();
        System.out.println("Removing the first and last items. " + num + " items were removed.");
        morePeople.Display_List();



    }
}
