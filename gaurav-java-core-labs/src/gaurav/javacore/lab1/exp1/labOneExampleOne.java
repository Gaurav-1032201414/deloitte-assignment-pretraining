//Lab 1: Flow Control/Operators/Assignments
//Exercise 1: Sum of Cubes of Digits

package gaurav.javacore.lab1.exp1;

public class labOneExampleOne {
    public static int sumOfCubes(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum;
    }
}
