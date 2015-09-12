package com.company;

import java.util.Scanner;

/**
 * Created by Mia on 2/26/2015.
 */
public class Tools {
    protected static Scanner input = new Scanner(System.in);

    public String capFirst(String source) {
        char [] array = source.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        return new String(array);
    }

    public boolean Again(){
        String reply = input.nextLine();
        if (reply.equals("y") || reply.equals("yes")){
            return true;
        }
        else
            return false;
    }


}
