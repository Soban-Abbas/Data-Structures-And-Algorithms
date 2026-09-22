package array;

import java.util.Scanner;

public class largestelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set Size of Array : ");
        int sizeOfArray = sc.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            int number=i+1;
            System.out.print("Enter " + number + " Value in array : ");
            array[i] = sc.nextInt();

        }

      int largetInArray=array[0];

      for (int i=0;i<array.length;i++) {
        if(largetInArray<array[i]);
        largetInArray=array[i];
      }
System.out.print("Largest from array : " + largetInArray);

    }
}
