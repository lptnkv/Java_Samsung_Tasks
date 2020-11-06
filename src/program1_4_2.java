import java.util.Scanner;

public class program1_4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = 1;
        b = b << n;
        System.out.println(b);
    }
}
