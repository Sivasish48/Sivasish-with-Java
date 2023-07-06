import java.util.Scanner;

public class FactorialOfNNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int product  = 1, i=1;
        while (i <= n) {
            product *= i;
            i++;

        }
        System.out.println(product);



    }
}
