/*
 * Input.java
 * Input datatype
 * 1. Scanner - scanner datatype
 * 2. User Input - user input datatype
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        UserInput.main(args);
    }
}

class UserInput {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a number: ");
        try (Scanner myObj = new Scanner(System.in)) {
            x = myObj.nextInt();
        }
        System.out.println("You entered: " + x);
    }
}

