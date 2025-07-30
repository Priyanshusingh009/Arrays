import java.util.Arrays;
//Write a Java program to find the rotation count in a given rotated sorted array of integers
public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int minIndex = 0;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        System.out.println("NO of rotaions are = "+minIndex);    
    }
    
}
