import java.util.Scanner;

public class program1_5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println((x / 100 != 0) && (x / 100 < 10) && (x % 5 == 0) && (x > 0));
    }
}
