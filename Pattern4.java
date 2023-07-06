import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");

                } for (int d=0; d<n-i-1;d++){
                System.out.print("-");



            }
            System.out.println();
        }


    }


}


