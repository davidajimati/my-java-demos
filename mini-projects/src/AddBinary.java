/**
 * This program accepts 2 binary numbers
 * adds them together and outputs the addition of the
 * 2 numbers in binary
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddBinary {
    public static void main(String[] args) {
        System.out.println("Enter the first binary number: ");
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();

        System.out.println("Enter the second binary number: ");
        long b = input.nextLong();

        System.out.println("The addition of " + a + " and " + b + " in base 2 is: ");
        List<Integer> resp = binaryAdder(a, b);
        int len = resp.size() - 1;

        while (len >= 0){
            System.out.print(resp.get(len));
            --len;
        }
    }

    private static List<Integer> binaryAdder(long binary1, long binary2) {
        int rem = 0;
        List<Integer> sum = new ArrayList<>();
        while (binary1 != 0 || binary2 != 0) {
            sum.add((int) (binary1 % 10 + binary2 % 10 + rem) % 2);
            rem = (int) (binary1 % 10 + binary2 % 10 + rem) / 2;
            binary1 /= 10;
            binary2 /= 10;
        }
        if (rem > 0)
            sum.add(rem);
        return sum;
    }
}