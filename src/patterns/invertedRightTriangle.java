package patterns;

import java.util.Scanner;

public class invertedRightTriangle {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int totalNumberOfRows = sc.nextInt();

        for(int rows=1;rows<=totalNumberOfRows;rows++){
            for(int stars=1; stars<=(totalNumberOfRows-rows)+1;stars++){
                System.out.print("*"+" ");
            }
            
            System.out.println("");
        }
    }
}
