package fr.calculator;

import fr.welcome.Welcome;

public class Main {
    public static void main(String[] args) {
    Welcome welcome = new Welcome();
    String message = welcome.getMessage();
    System.out.println(message);
   }
}