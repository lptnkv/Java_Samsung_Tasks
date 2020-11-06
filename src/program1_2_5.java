import java.util.Scanner;

public class program1_2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = n / 3600 % 24;
        int m = n / 60 % 60;
        int s = n % 60;
        System.out.print(h);
        System.out.print(':');
        if (m / 10 == 0) {
            System.out.print('0');
        }
        System.out.print(m);
        System.out.print(':');
        if (s / 10 == 0) {
            System.out.print('0');
        }
        System.out.print(s);
    }
}
