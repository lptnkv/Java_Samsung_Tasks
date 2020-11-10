import java.util.Scanner;

public class program1_6_dop_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        double buf;
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("impossible");
        }
        else {
            if (b < c){
                buf = b;
                b = c;
                c = buf;
            }
            if (a < b){
                buf = a;
                a = b;
                b = buf;
            }

            if (b < c){
                buf = b;
                b = c;
                c = buf;
            }
            
            if (a < b){
                buf = a;
                a = b;
                b = buf;
            }
            if (a*a == b*b + c*c) {
                System.out.println("right");
            }
            else {
                double alpha = Math.acos((b * b + c * c - a * a) / (2 * b * c));
                if (alpha < Math.PI / 2) {
                    System.out.println("acute");
                }
                else {
                    System.out.println("obtuse");
                }
            }

        }
    }
}