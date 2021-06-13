package ru.ibs.maven.homework2;



import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Timur\\IdeaProjects\\JUnit_Homework\\src\\main\\resources\\test.txt"))) {
            edittext(file);
        }
    }

        public static void edittext(BufferedReader file) throws IOException{
            while (file.ready()) {
                Integer num = Integer.parseInt(file.readLine());
                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (num % 3 == 0) {
                    System.out.println("Fizz");
                } else if (num % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(num);
                }
            }
        }


}