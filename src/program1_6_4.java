import java.util.Scanner;

public class program1_6_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextFloat();
        double b = in.nextFloat();
        double res;
        if (a <= 0 && b <= 0) {
            System.out.println("no such x");
        }
        else if (-b/a <= 0) {
            System.out.println("any x");
        }
        else if (a > 0) {
            res = -(b/a);
            res = Math.round(res * 10) / 10.0;
            System.out.println("x<-" + res + " or x>" + res);
        }
        else {
            res = -(b/a);
            res = Math.round(res * 10) / 10.0;
            System.out.println(-res + "<x<" + res);
        }
    }
}
