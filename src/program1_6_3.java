import java.util.Scanner;

public class program1_6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if((a % 100 == 1 || a % 10 == 1) && (a % 100 != 11)){
            System.out.println(a + " TOPT");
        }

        if(a % 100 < 21){
            if(a % 100 > 4 || a == 0){
                System.out.println(a + " TOPTOB");
            }
            else if(a % 100 > 1 && a % 100 < 5){
                    System.out.println(a + " TOPTA" );
                }
        }

        if(a % 100 > 21){
            if(a % 10 > 1 && a % 10 < 5){
                System.out.println(a + " TOPTA" );
            }
            else if(a % 10 > 4) {
                    System.out.println(a + " TOPTOB");
                }
        }
    }
}
