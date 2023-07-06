import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int sum = 0, i = 1;
        while (i <= number){
            sum+= i ;
            i++;
        }
        System.out.println(sum);




         }
    }

