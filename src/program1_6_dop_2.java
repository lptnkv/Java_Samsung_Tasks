import java.util.Scanner;

public class program1_6_dop_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int d = in.nextInt();
        if (m > 12 || m < 1 || d > days(m) || d < 1) {
            System.out.println(-1);
        }
        else {
            int sum = 0;
            for ( ; m <= 12; m++) {
                sum += days(m);
            }
            sum -= d;
            System.out.println(sum);
        }
    }

    static int days(int m) {
        int days = 0;
        if (m <= 12 && m >= 1) {
            days = 28 + (m + m / 8) % 2 + 2 % m + 1 / m * 2;
        }
        return days;
    }
}
