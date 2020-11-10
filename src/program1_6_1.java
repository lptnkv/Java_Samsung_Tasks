import java.util.Scanner;

public class program1_6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if ((x >= 0) && (x / 10 == 0)){
            System.out.println("DIGIT");
        }
        else if ((x > 0) && (x / 10 > 0) && (x / 10 < 10)){
            System.out.println("NUM");
        }
        else {
            System.out.println("OTHER");
        }
    }
}
