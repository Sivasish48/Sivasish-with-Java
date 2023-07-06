import java.util.Scanner;

public class EvanOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();

       /* if ( number % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println( " odd ");
        } */
        // TERNIARY OPERATOR
        System.out.println( number % 2 == 0 ? "even" : " odd " );

    }
    }