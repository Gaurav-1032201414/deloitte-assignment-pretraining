//Lab 1: Flow Control/Operators/Assignments
//Exercise 4: Prime Numbers

package gaurav.javacore.lab1.exp4;

import java.util.Scanner;

public class labOneExampleFour {

    private static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();

        for(int i = 2; i <= num; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
}
