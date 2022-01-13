package com.homework;

public class CandidateVotingAge {

    public static void main(String[] args) {
        // if candidate is 18 years old, are eligible for voting
        // if candidate is less than 18 years old are not able to vote

        int age = 18;

        if (age >= 18) {
            System.out.println("candidates are eligible to vote");
        } else {
            System.out.println("candidates are not eligible to vote");
        }


        if (age == 18) {
            System.out.println("candidate name should be in the voting list");
        }
        else {
            System.out.println("candidate name should not be in the voting list");
        }
    }
}
