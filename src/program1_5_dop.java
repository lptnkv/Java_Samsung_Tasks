import java.util.Scanner;

public class program1_5_dop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (((x < Math.sqrt(1-Math.pow(y, 2))) && (x > -Math.sqrt(1 - Math.pow(y, 2))))
                || ((x < 1) && (y < 1) && (x > 0) && (y > 0))) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
