import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){                     // i is the variable for increasing or decreasing purpose
            for(int sp=0;sp<n-i-1;sp++){      // sp is used for space purpose that is sp = n-i-1
                System.out.print(" ");
            }  for(int decn=i+1;decn>=1;decn--){     // decn is the variable for decreasing purpose which starts from no that is i+1 and end with number 1.
                System.out.print(decn);
            } for(int incn=2;incn<=i+1;incn++){     // incn is the variable for increasing purpose which starts with number 2 and ends with number that is i+1.
                System.out.print(incn);
            }
            System.out.println();
        }

    }


    }