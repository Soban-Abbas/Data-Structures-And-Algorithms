package patterns;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        int column = rows * 2;
        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i == rows) {
                for (int j = 1; j <= column; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = 1; j <= column; j++) {
                    if (j == 1 || j == column) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }

        sc.close();
    }

}
