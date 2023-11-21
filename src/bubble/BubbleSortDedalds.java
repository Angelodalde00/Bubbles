
package bubble;

 import java.util.Arrays;


  public class BubbleSortDedalds {

   
    public static void main(String[] args) {
        
        
        int[] intArraynidedalds ={64,34,25,12,22,11,90};
    
         System.out.println("Original Integer Array: " +Arrays.toString(intArraynidedalds));
        
          bubbleSort(intArraynidedalds);
           System.out.println("Sorted Integer Array: " +Arrays.toString(intArraynidedalds));
    }
    
    
    static void bubbleSort(int[] arr){
     int n = arr.length;
       for(int i = 0; i <n - 1; i++){
        for (int j = 0; j <n - i - 1; j++){
            if (arr[j] > arr[j + 1]){
                 //swap guys okay rako na okay naka hays :(
                  int temp = arr[j];
                   arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
            }
        }
    }
    }
}
