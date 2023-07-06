import java.util.Scanner;

public class BasePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the base and power");
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        int total = b;
        for (int i = 1; i <= p; i++) {
            total = total * b; 

        }
        System.out.println(total = total * b);



    }
}
