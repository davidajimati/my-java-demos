import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("what is your score?");
        Scanner in2 = new Scanner(System.in);
        int score = in2.nextInt();

        if (score > 70)
            System.out.println("You had an 'A'");
        else if (score >= 60 && score < 70)
            System.out.println("You had a 'B'");
        else if (score >= 50 && score < 60)
            System.out.println("You had a 'C'");
        else if (score == 45)
            System.out.println("You had a 'D'");
        else
            System.out.println("You had an 'F'");
    }
}
