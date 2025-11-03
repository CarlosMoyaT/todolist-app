package org.example;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // we ask data to user
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce name of your task: ");
        String nameTask = sc.nextLine(); // save data on the String

        System.out.println("Introduce description task: ");
        String descriptionTask = sc.nextLine();

        // create the object with the data introduced
        Task t1 = new Task(nameTask, descriptionTask, LocalDateTime.now());




    }

}