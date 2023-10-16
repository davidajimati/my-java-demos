import java.util.Scanner;
public class InputAverage {
    public static void main(String[] args) {
        System.out.println("Enter the 5 numbers to calculate average, separate only by space:");

        Scanner input = new Scanner(System.in);
        int aa = input.nextInt();
        int bb = input.nextInt();
        int cc = input.nextInt();
        int dd = input.nextInt();
        int ee = input.nextInt();

        System.out.println(averageCalc(aa, bb, cc, dd, ee));
    }

    private static float averageCalc(int a, int b, int c, int d, int e) {
        return ((float) (a + b + c + d + e) / 5);
    }
}
