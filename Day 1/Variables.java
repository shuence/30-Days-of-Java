/* In java there are different types of datatypes/variables:
 */

// Syntax - datatype variableName = value;

public class Variables {
    public static void main(String[] args) {
        String name = "Shubham";
        int age = 25;
        double height = 6.1;
        boolean isAdult = true;
        char a = 'A';
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Adult: " + isAdult);
        System.out.println("Character: " + a);
        InnerVariables.Sum(args);
        Identifiers.identify(args);
        Constants.constant(args);
        StudentData.student(args);
    }
}

class InnerVariables {
    public static void Sum(String[] args) {
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println("Sum: " + z);
    }
}

class Identifiers {
    public static void identify(String[] args) {
        int totalTimehour = 60; // Good Identifier Practice
        int total_time_hour = 60; // Bad Identifier Practice
        int x = 60; // Bad Identifier Practice

        System.out.println("Good Identifier: " + totalTimehour);
        System.out.println("Bad Identifier: " + total_time_hour + " " + "&" + " " + x);
    }
}

class Constants {
    public static void constant(String[] args) {
        final int x = 10;
        // x = 20; // This will give an error because x is a constant
        System.out.println("Constant: " + x);
    }
}

class StudentData {
    public static void student(String[] args) {
        String studentName = "Shuence";
        int studentAge = 20;
        double studentHeight = 175;
        int studetId = 2232;
        double studentCgpa = 7.3;

        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Height: " + studentHeight);
        System.out.println("Student ID: " + studetId);
        System.out.println("Student CGPA: " + studentCgpa);
    }
}