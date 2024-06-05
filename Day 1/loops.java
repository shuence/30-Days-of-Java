/*
 * Loops.java
 * In java there are different types of control statements:
 * 1. Loops - loops statement
 * 2. For Loop
 * 3. While Loop
 * 4. Do While Loop
 * 5. For Each Loop
 * 
 */

public class loops {
    public static void main(String[] args) {
        ForLoop.main(args);
        WhileLoop.main(args);
        DoWhileLoop.main(args);
        ForEachLoop.main(args);
    }
}

class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}

class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}

class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}