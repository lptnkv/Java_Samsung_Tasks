import java.util.Scanner;

public class program1_5_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] xs;
        int n = 4;
        boolean found = false;
        xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = in.nextInt();
        }

        cycle:
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (xs[i] + xs[j] == 0){
                    found = true;
                    break cycle;
                }
            }
        }
        System.out.println(found);
    }
}
