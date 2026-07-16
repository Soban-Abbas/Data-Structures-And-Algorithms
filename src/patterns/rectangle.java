package patterns;
import java.util.Scanner;
public class rectangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
int column=rows*2;

for(int i=1;i<=rows;i++){
    for(int j=1;j<=column;j++){
        System.out.print("*" +" ");
    }
    System.out.println("");
}
        sc.close();
    }
}