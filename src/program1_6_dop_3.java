import java.util.Scanner;

public class program1_6_dop_3 {
    enum Numeral {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100);
        int weight;
        Numeral(int weight) {
            this.weight = weight;
        }
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Numeral[] values = Numeral.values();
        String res = "";
        for (int i = values.length - 1; i >= 0; i--) {
            while(x >= values[i].weight){
                res += values[i];
                x -= values[i].weight;
            }
        }
        System.out.println(res);
    }
}
