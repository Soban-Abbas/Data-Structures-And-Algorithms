package array;

public class seconglargestinArray {
    public static void main(String[] args) {
        int[] array = {2,4,-3,443, -23};
        int largest=array[0];
        int secondLargest=array[0];
        

        for(int i=1 ; i<array.length;i++){
            if(largest<array[i]){
                secondLargest=largest;
                largest=array[i];
            
            }
          
            
        }
        System.out.println("largest from array :" +largest);
        System.out.println("Second larget  from array is :" +secondLargest);
    }
}

