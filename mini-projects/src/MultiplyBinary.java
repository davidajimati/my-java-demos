/**
 * This program reads 2 binary numbers from the input
 * multiplies the 2 binary numbers and outputs the product in base 2(binary)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MultiplyBinary {
    public static void main(String[] args) {
        System.out.println("This program calculates the product of 2 binary numbers");

        System.out.println("Input first binary number: ");
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println("Input second binary number: ");
        Scanner in2 = new Scanner(System.in);
        int input2 = in2.nextInt();

        List<List<Integer>> result = (multiplyHelper(input1, input2));
        for(int j = result.size() - 1; j >= 0; j--) {
            System.out.print(result.get(j));
        }
    }

    private static List<List<Integer>> multiplyHelper(String a, int b) {
        // declare the variables
        int i, rem = 0;
        List<List<Integer>> collatedProduct = new ArrayList<>();

        /*
          carry out the multiplication.
          add all results to a list
          and the list of products to a list of lists. each list will then be added with the adder method.
         */

        for(i = a.length() - 1; i >= 0; i--) {
            int focus = (int)a.charAt(i), zeros = 0;
            List<Integer> product = new ArrayList<>();

            while(b != 0) {
                product.clear();
                product.add(((focus * (b % 10) + rem) % 2));
                rem = (((focus * (b % 10) + rem) / 2));

                for(;zeros > 0; zeros--) {
                    product.add(0);
                }
                b /= 10;
            }
            if (rem != 0)
                product.add(rem);
            rem = 0;
            collatedProduct.add(product);
            ++zeros;
        }
        return collatedProduct;
    }

//    private static int addHelper(int a , int b, int c) {
//        return a
//    }
}
