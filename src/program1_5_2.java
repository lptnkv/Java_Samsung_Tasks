import java.util.Scanner;

public class program1_5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double x11 = -3;
        double x12 = 5;
        double x21 = 9;
        double x22 = 15;
        System.out.println(((x >= x11) && (x <= x12)) || ((x >= x21) && (x <= x22)));
    }
}