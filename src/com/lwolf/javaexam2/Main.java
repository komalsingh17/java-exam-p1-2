package com.lwolf.javaexam2;

/**
 * Created by kdhaliwal on 3/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        if(args.length>0)   System.out.println("Hi, "+args[0]+". How are you?");
        else System.out.println("No name passed.");
    }
}
