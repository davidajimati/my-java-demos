/**
 * This program reads 2 binary numbers from the input
 * multiplies the 2 binary numbers and outputs the product in base 2(binary)
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MultiplyBinary {
    public static void main(String[] args) {
        System.out.println("This program calculates the product of 2 binary numbers");

        System.out.println("Input first binary number: ");
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        System.out.println("Input second binary number: ");
        Scanner in2 = new Scanner(System.in);
        int input2 = in2.nextInt();

        System.out.println(multiplyHelper(input1, input2));
    }

    private static List<Integer> multiplyHelper(int a, int b) {
        int i, j, rem = 0;
        List<Integer> product = new ArrayList<>();
        while(a != 0|| b != 0) {
            product.add((int) ((a % 10) * (b % 10) + rem) % 2);
        }
        return product;

    }
}
