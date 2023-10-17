import java.util.Arrays;
import java.util.Scanner;
public class AddBinary {
    public static void main(String[] args) {
        System.out.println("Enter the first binary number: ");
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();

        System.out.println("Enter the second binary number: ");
        long b = input.nextLong();

        System.out.println("The addition of " + a + " and " + b + " in base 2 is: ");
        Object[] resp = binaryAdder(a, b);
        int[] result = (int[]) resp[1];

        System.out.println(Arrays.toString(result));

        int len = (int)resp[2];

        while (len >= 0){
            System.out.print(result[len]);
            --len;
        }
    }

    private static Object[] binaryAdder(long binary1, long binary2) {
        int i = 0, rem = 0;
        int[] sum = new int[20];
        while (binary1 != 0 || binary2 != 0) {
            sum[i] = (int) (binary1 % 10 + binary2 % 10 + rem) % 2;
            rem = (int) (binary1 % 10 + binary2 % 10 + rem) / 2;
            binary1 /= 10;
            binary2 /= 10;
            i++;
        }
        if (rem > 0)
            sum[++i] = rem;

        Object[] objects = new Object[2];
        objects[0] = sum;
        objects[1] = i;
        return objects;
    }
}
