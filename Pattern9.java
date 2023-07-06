import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int st = 0; st < rows - 1; st++) {
                System.out.print("*");
            }
            for (int sp = 1; sp < 2 * i + 1; sp++) {
                System.out.print(" ");
               // System.out.println()
            } for(int str =0;str<rows-1;str++){
                System.out.print("*");
            }
            System.out.println();
        }  for(int i = 0; i<rows;i++) {
            for (int st = 0; st < rows - 1; st++) {
                System.out.print("*");
            }
            for (int sp = 1; sp < 2 * i + 1; sp++)
                System.out.print(" ");
            for (int str = 0; str < rows - 1; str++) {
                System.out.print("*");
            } // System.out.println();
        }


    }
}