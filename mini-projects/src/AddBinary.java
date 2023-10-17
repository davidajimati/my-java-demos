import java.util.List;
import java.util.Scanner;
public class AddBinary {
    public static void main(String[] args) {
        System.out.println("Enter the first binary number: ");
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();

        System.out.println("Enter the second binary number: ");
        long b = input.nextLong();

//        System.out.println("The addition of " + a + " and " + b + "in base 2 is: ");
        Object[] resp = binaryAdder(a, b);
        int[] result = resp[1];


//        System.out.println(answer);
        int j = resp[1].length - 1;
        while (j >= 0){
            System.out.print(answer[j]);
            --j;
        }
    }

    private static Object[] binaryAdder(long binary1, long binary2) {
        int i = 0, rem = 0;
        int[] sum = new int [20];
        while(binary1 !=0 || binary2 != 0) {
            sum[i] = (int)(binary1 % 10 + binary2 % 10 + rem) % 2;
            rem = (int)(binary1 % 10 + binary2 % 10 + rem) / 2;
//            System.out.println(sum[i]);
            binary1 /= 10;
            binary2 /= 10;
            i++;
        }
        if (rem > 0)
            sum[++i] = rem;

        Object[] objects = new Object[2];
        objects[1] = sum;
        objects[2] = i;

        return objects;
    }
    public Results (List<Integer> list, int b) {
        this.list = list;


    }

}
