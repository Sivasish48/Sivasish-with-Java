import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        int product= 1;
        for (int i= 1; i<=number;i++){
            product*=i;

        }
        System.out.println(product);
    }
}
