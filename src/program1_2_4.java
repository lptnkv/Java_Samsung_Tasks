import java.util.Scanner;

public class program1_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        b = b * n;
        int sum = a * n + (b / 100);
        b = b % 100;
        System.out.print(sum);
        System.out.print(' ');
        System.out.print(b);
    }
}
