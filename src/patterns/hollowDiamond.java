package patterns;
import java.util.Scanner;

public class hollowDiamond {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int total_Rows = sc.nextInt();

        for(int row= 1 ; row<=total_Rows;row++){
            for(int space=1 ;space<=total_Rows-row;space++){
System.out.print(" ");
            }
            for(int stars=1 ; stars<=row+(row-1);stars++){
                if (stars==1 || stars==row+(row-1)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }



        for (int row = total_Rows-1; row >=1; row--) {
            for (int space = 1; space <= total_Rows - row; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= row + (row - 1); stars++) {
                if (stars == 1 || stars == row + (row - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }





        sc.close();
    }
}