import java.util.Scanner;

public class program1_6_dop_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        if (m < 1 || m > 12) {
            System.out.println(0);
        }
        else {
            int days = 28 + (m + m / 8) % 2 + 2 % m + 1 / m * 2;
            System.out.println(days);
        }
    }
}
