package patterns;

import java.util.Scanner;

public class helloParamid {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int total_Rows = sc.nextInt();

        for(int row=1;row<=total_Rows;row++){
            for(int space=1;space<=total_Rows-row;space++){
                System.out.print("  ");
            }
           
                for(int star=1;star<=row+(row-1);star++){
          if(row==total_Rows){
System.out.print("*" +" ");
          }else{
            if(star==1 || star==row+(row-1)){
                System.out.print("*"+" ");
            }else{
                System.out.print("  ");
            }
          }
                }
                 System.out.println("");
            }
                        sc.close();
            }
           

        }

