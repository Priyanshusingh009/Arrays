import java.util.*;
public class Deletion {
    public static void main(String[] args) {
        
        int[] arr = new int[10]; 
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int size = 5; // current number of elements

        System.out.println("Before deletion: " + Arrays.toString(arr));

        int deleteIndex = 2; 

        // Shift elements to the left
        for (int i = deleteIndex; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Mark last filled space as empty (0)
        arr[size - 1] = 0;
        size--; // reduce size count

        System.out.println("After deletion:  " + Arrays.toString(arr));
    }
    
}
