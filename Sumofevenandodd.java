import javax.swing.*;
import java.util.Scanner;

public class Sumofevenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int userinput = sc.nextInt();
        int sumofeven = 0;
        int sumofodd = 0;
        int x;
        while (userinput > 0) {
            x = userinput % 10;
            if (x % 2 == 0) {
                sumofeven = sumofeven + x;
            } else {

                sumofodd = sumofodd + x;
            }

            userinput = userinput / 10;
        }




            System.out.println("Sum of even"+sumofeven);

            System.out.println("Sum of odd"+sumofodd);


        }

    }







