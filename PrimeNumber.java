import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number=scanner .nextInt();
    boolean doggy=true;
    for (int i=2;i<number;i++){
        if (number%i==0){
            System.out.println("Not prime");
            doggy = false;


        } if (doggy){
            System.out.println("Prime");
        }
    }
    }
}
