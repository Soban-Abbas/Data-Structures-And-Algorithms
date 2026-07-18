package patterns;

import java.util.Scanner;

public class triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
for(int k=1;k<=i;k++){
    System.out.print("*");
}

            System.out.println("");

        }
    }
}
//outer loop which print rows has 2more nested loops one 
//for printing spaces and second for printing starts