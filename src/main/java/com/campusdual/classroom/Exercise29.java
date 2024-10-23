package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        int i;
        try{
            i = 563675557 / 0;
        } catch (Exception e){
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
