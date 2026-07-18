package patterns;

import java.util.Scanner;

public class diamond {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int totalNumberOfRows = sc.nextInt();

for(int rows=1;rows<=totalNumberOfRows;rows++){
    for(int spaces=1;spaces<=totalNumberOfRows-rows;spaces++){
        System.out.print("  ");
    }
    for(int star=1;star<=rows+(rows-1);star++){
        System.out.print("*"+" ");
    }
    System.out.println();
}

for (int rows = totalNumberOfRows-1; rows >=1; rows--) {
    for (int spaces = 1; spaces <= totalNumberOfRows - rows; spaces++) {
        System.out.print("  ");
    }
    for (int star = 1; star <= rows + (rows - 1); star++) {
        System.out.print("*" + " ");
    }
    System.out.println();
}
        sc.close();

         }
}
