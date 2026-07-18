package patterns;

import java.util.Scanner;

public class invertedParamid {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int totalNumberOfRows = sc.nextInt();

        for(int rows=totalNumberOfRows;rows>=1;rows--){
            for(int spaces=1;spaces<=totalNumberOfRows-rows;spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=rows+(rows-1);stars++){
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
         }
}
