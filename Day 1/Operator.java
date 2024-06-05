/*
 * Operator.java
 * In java there are different types of operators:
 * 1. Arithmetic Operators
 * 2. Assignment Operators
 * 3. Comparison Operators
 * 4. Logical Operators
 * 5. Bitwise Operators
 * 6. Ternary Operator
 * 7. Instanceof Operator
 * 
 */

public class Operator {
    public static void main(String[] args) {
        ArithmeticOperators.main(args);
        AssignmentOperators.main(args);
        ComparisonOperators.main(args);
        LogicalOperators.main(args);
        BitwiseOperators.main(args);
        TernaryOperator.main(args);
        InstanceofOperator.main(args);
    }   
}

class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x + y); // Addition
        System.out.println(x - y); // Subtraction
        System.out.println(x * y); // Multiplication
        System.out.println(x / y); // Division
        System.out.println(x % y); // Modulus
        System.out.println(x++); // Increment
        System.out.println(x--); // Decrement
    }
}

class AssignmentOperators {
    public static void main(String[] args) {
        int x = 5;
        x += 3; // x = x + 3
        System.out.println(x);
        x -= 3; // x = x - 3
        System.out.println(x);
        x *= 3; // x = x * 3
        System.out.println(x);
        x /= 3; // x = x / 3
        System.out.println(x);
        x %= 3; // x = x % 3
        System.out.println(x);
    }
}

class ComparisonOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x == y); // Equal to
        System.out.println(x != y); // Not equal to
        System.out.println(x > y); // Greater than
        System.out.println(x < y); // Less than
        System.out.println(x >= y); // Greater than or equal to
        System.out.println(x <= y); // Less than or equal to
    }
}

class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x < 5 && y > 1); // Logical and
        System.out.println(x < 5 || y > 1); // Logical or
        System.out.println(!(x < 5 && y > 1)); // Logical not
    }
}

class BitwiseOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x & y); // Bitwise and
        System.out.println(x | y); // Bitwise or
        System.out.println(x ^ y); // Bitwise xor
        System.out.println(~x); // Bitwise not
        System.out.println(x << 1); // Bitwise shift left
        System.out.println(x >> 1); // Bitwise shift right
    }
}

class TernaryOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int result = (x > y) ? x : y;
        System.out.println(result);
    }
}

class InstanceofOperator {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name instanceof String);
    }
}
