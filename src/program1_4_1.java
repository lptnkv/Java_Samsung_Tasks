import java.util.Scanner;

public class program1_4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = in.nextInt();
        a = a >> i;
        a = a << i;
        System.out.println(a);
    }
}