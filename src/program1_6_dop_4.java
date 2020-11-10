import java.util.Scanner;

public class program1_6_dop_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        int b = in.nextInt();
        if (b > max) {
            max = b;
        }
        int c = in.nextInt();
        if (c > max) {
            max = c;
        }
        System.out.println(max);

    }
}
