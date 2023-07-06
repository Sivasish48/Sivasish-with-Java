import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int number = userinput.nextInt();
        int m = userinput.nextInt();

        for (int i = 1;i<=number;i++){
            for(int j = 1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
