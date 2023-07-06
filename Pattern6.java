import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, sp, st;
        for (i = 0; i < n; i++) {
            for (sp = 0; sp < n - i - 1; sp++){
                System.out.print(" ");}


            for (st = 0; st < 2 * i + 1; st++){
                System.out.print("*");}
            System.out.println();
        }
    }
}



