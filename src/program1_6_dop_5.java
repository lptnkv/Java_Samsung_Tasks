import java.util.Scanner;

public class program1_6_dop_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (b < a){
            int buf = a;
            a = b;
            b = buf;
        }
        int c = in.nextInt();
        if (c < b) {
            int buf = c;
            c = b;
            b = buf;
        }
        if (b < a) {
            int buf = b;
            b = a;
            a = buf;
        }
        System.out.print(a + " " + b + " " + c);
    }
}
