/* 
 * DataType.java
 * In java there are different types of datatypes/variables:
 * 1. String - sequence of characters
 * 2. int - integer
 * 3. double - decimal number
 * 4. boolean - true or false
 * 5. char - single character
 
 */

public class DataType {
    public static void main(String[] args) {
        Premitive.main(args);
        NonPremitive.main(args);
    }
}


/*
 * Premitive Data Types
 * byte - 1 byte
 * short - 2 bytes
 * int - 4 bytes
 * long - 8 bytes
 * float - 4 bytes
 * double - 8 bytes
 * char - 2 bytes
 * boolean - 1 bit
 */

 class Premitive {
        public static void main(String[] args) {
            byte myNum = 100;
            System.out.println(myNum);
    
            short myShortNum = 5000;
            System.out.println(myShortNum);
    
            int myIntNum = 100000;
            System.out.println(myIntNum);
    
            long myLongNum = 15000000000L;
            System.out.println(myLongNum);
    
            float myFloatNum = 5.75f;
            System.out.println(myFloatNum);
    
            double myDoubleNum = 19.99d;
            System.out.println(myDoubleNum);
    
            char myLetter = 'A';
            System.out.println(myLetter);
    
            boolean myBool = true;
            System.out.println(myBool);
        }
 }

 /* 
  * Non-Premitive Data Types
    * String
    * Array
    * Class
    * Interface
 */

 class NonPremitive{
        public static void main(String[] args) {
            String myString = "Hello";
            System.out.println(myString);
    
            String[] cars = {"Volvo", "BMW", "Ford"};
            System.out.println(cars[0]);
    
            System.out.println(cars.length);
    
            System.out.println(cars[1]);
    
            System.out.println(cars[2]);

        }
 }
