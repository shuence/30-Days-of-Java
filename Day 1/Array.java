/*
 * Array.java
 * Array datatype
 * 1. Array - array datatype
 * 2. Multidimensional Array - multidimensional array datatype
 */

public class Array {
    public static void main(String[] args) {
        ArrayDataType.main(args);
        MultidimensionalArray.main(args);
    }
}

class ArrayDataType {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
    }
}

class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7
    }
}

