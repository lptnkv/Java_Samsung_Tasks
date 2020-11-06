import java.util.Scanner;

public class program1_3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int diag = a*a + b*b;
        System.out.println(diag);
    }
}
