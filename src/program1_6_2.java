import java.util.Scanner;

public class program1_6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a <= b) && (a <= c)){
            System.out.print(a);
            System.out.print(" ");
            if (b < c) {
                System.out.print(b);
                System.out.print(" ");
                System.out.print(c);
            }
            else {
                System.out.print(c);
                System.out.print(" ");
                System.out.print(b);
            }

        }
        else if ((b <= a) && (b <= c)){
            System.out.print(b);
            System.out.print(" ");
            if (a < c){
                System.out.print(a);
                System.out.print(" ");
                System.out.print(c);
            }
            else {
                System.out.print(c);
                System.out.print(" ");
                System.out.print(a);
            }
        }
        else {
            System.out.print(c);
            System.out.print(" ");
            if (a<b) {
                System.out.print(a);
                System.out.print(" ");
                System.out.print(b);
            }
            else {
                System.out.print(b);
                System.out.print(" ");
                System.out.print(a);
            }
        }
    }
}
