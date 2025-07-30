import java.util.Arrays;

public class rotateClockwise{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int temp=arr[arr.length-1];
        for(int i =arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println("AFTER ROTATING ARRAY CLOCKWISE : "+Arrays.toString(arr));
    }
}