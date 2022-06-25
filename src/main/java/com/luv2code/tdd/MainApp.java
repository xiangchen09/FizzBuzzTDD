package com.luv2code.tdd;

public class MainApp {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(FizzBuzz2.compute(i));

            //add on stash branch
            System.out.println("1");
            System.out.println("2");

            //add another line of code with stash#2
            System.out.println("3");
            System.out.println("4");

            //Merge Conflict and Rebase practice
            System.out.println("Merge with Conflict");

            //Add a Line on Master for branch to update
        }
    }

}
