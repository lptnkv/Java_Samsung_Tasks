import java.util.Scanner;

public class program1_5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double x11 = -2;
        double x12 = 3;
        double x21 = 6;
        double x22 = 9;
        System.out.println(!(((x >= x11) && (x <= x12)) || ((x >= x21) && (x <= x22))));
    }
}