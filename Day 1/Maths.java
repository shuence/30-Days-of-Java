/*
 * Maths.java
 * java maths library
 * 1. Math.abs() - returns the absolute value of a number
 * 2. Math.max() - returns the highest value of two numbers
 * 3. Math.min() - returns the lowest value of two numbers
 * 4. Math.sqrt() - returns the square root of a number
 * 5. Math.cbrt() - returns the cube root of a number
 * 6. Math.pow() - returns the value of the first argument raised to the power of the second argument
 * 7. Math.ceil() - returns the smallest integer that is greater than or equal to the argument
 * 8. Math.floor() - returns the largest integer that is less than or equal to the argument
 * 9. Math.round() - returns the closest long or int, as indicated by the method's return type, to the argument
 * 10. Math.random() - returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
 * 11. Math.sin() - returns the trigonometric sine of an angle
 * 12. Math.cos() - returns the trigonometric cosine of an angle
 * 13. Math.tan() - returns the trigonometric tangent of an angle
 * 14. Math.asin() - returns the arc sine of a value
 * 15. Math.acos() - returns the arc cosine of a value
 * 16. Math.atan() - returns the arc tangent of a value
 * 
 */

public class Maths {

    public static void main(String[] args) {
        System.out.println(Math.abs(-4.7)); // Outputs 4.7
        System.out.println(Math.max(5, 10)); // Outputs 10
        System.out.println(Math.min(5, 10)); // Outputs 5
        System.out.println(Math.sqrt(64)); // Outputs 8.0
        System.out.println(Math.cbrt(64)); // Outputs 4.0
        System.out.println(Math.pow(5, 3)); // Outputs 125.0
        System.out.println(Math.ceil(4.6)); // Outputs 5.0
        System.out.println(Math.floor(4.6)); // Outputs 4.0
        System.out.println(Math.round(4.6)); // Outputs 5
        System.out.println(Math.random()); // Outputs a random number
        System.out.println(Math.sin(90)); // Outputs the sine of 90
        System.out.println(Math.cos(0)); // Outputs the cosine of 0
        System.out.println(Math.tan(45)); // Outputs the tangent of 45
        System.out.println(Math.asin(0.5)); // Outputs the arc sine of 0.5
        System.out.println(Math.acos(0.5)); // Outputs the arc cosine of 0.5
        System.out.println(Math.atan(1)); // Outputs the arc tangent of 1
    }
}
