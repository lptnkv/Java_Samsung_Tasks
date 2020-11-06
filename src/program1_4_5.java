import java.util.Scanner;

public class program1_4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        a = a & ((1 << n) - 1);
        System.out.println(a);
    }
}
