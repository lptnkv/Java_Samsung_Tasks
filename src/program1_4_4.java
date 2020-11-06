import java.util.Scanner;

public class program1_4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        int b = 1 << n;
        a = a ^ b;
        System.out.println(a);
    }
}
