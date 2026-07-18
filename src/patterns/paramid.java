package patterns;

import java.util.Scanner;

public abstract class paramid {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int totalNumberOfRows = sc.nextInt();

        for(int rows=1;rows<=totalNumberOfRows;rows++){
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