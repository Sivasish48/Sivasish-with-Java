public class Debspattern {
    public static void main(String[] args) {
        int i, j;
        for ( i = 0;i<4;i++){
            for(int s = 0;s<4-i-1;s++){
                System.out.print(" ");
            } for( j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}