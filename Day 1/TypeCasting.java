/*
 * Type Casting
 * 1. Implicit Type Casting (Widening)
 * 2. Explicit Type Casting (Narrowing)
 */

public class TypeCasting {
    public static void main(String[] args) {
        ImplicitTypeCasting.main(args);
        ExplicitTypeCasting.main(args);
        Example.main(args);
    }
}

class ImplicitTypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
}

class ExplicitTypeCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}

class Example {
    public static void main(String[] args) {
        int maxScore = 500;
        int currentScore = 300;
        double percentage = (currentScore * 100.0) / maxScore;
        System.out.println("Percentage: " + percentage);
    }
}