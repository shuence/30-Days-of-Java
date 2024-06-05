/*
 * BreakContinue.java
 * In java there are different types of control statements:
 * 1. Break - break statement
 * 2. Continue - continue statement
 */

public class BreakContinue {
    public static void main(String[] args) {
        BreakStatement.main(args);
        ContinueStatement.main(args);
    }
}

class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}

class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}