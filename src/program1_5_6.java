import java.util.Scanner;

public class program1_5_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int n = 3;
        int x;
        for (int i = 0; i < 3; i++){
            x = in.nextInt();
            if (x % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter >= 2);
    }
}
