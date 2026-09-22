package array;

import java.util.Scanner;

public class basicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array : ");
        int size = sc.nextInt();
        int[] number = new int[size];
        int j = 1;
        for (int i = 0; i < size; i++) {
         
            System.out.print("Enter " + j + " values :");
            j++;
            number[i] = sc.nextInt();
        }
        j=0;
        
        for (int i : number) {
            System.out.println(i);
        }
    }
}
