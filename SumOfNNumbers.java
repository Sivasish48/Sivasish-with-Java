import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i<=number;i+=1){
            sum +=i;
        }
        System.out.println(sum);
    }
}
