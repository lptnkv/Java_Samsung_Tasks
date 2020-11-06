import java.util.Scanner;

public class program1_3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = (a % 10) + (a / 10 % 10) + (a / 100 % 10);
        System.out.println(sum);
    }
}
