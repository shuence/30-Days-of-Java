/*
 * IfElse.java
 * In java there are different types of control statements:
 * 1. IfElse - if else statement
 */

public class IfElse {
    public static void main(String[] args) {
        IfStatement.main(args);
        IfElseStatement.main(args);
        IfElseIfStatement.main(args);
        NestedIfStatement.main(args);
        TernaryOperator.main(args);
    }
}

class IfStatement {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
    }
}

class IfElseStatement {
    public static void main(String[] args) {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}

class IfElseIfStatement {
    public static void main(String[] args) {
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}

class NestedIfStatement {
    public static void main(String[] args) {
        int x = 30;
        int y = 10;
        if (x == 30) {
            if (y == 10) {
                System.out.println("X = 30 and Y = 10");
            }
        }
    }
}

class TernaryOperator {
    public static void main(String[] args) {
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}