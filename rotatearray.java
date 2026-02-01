import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("before rotation:");
        System.out.println(java.util.Arrays.toString(arr));
        int k =2;
        int n=arr.length;
        // //leftrotate
        // int temp=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     arr[i-1]=arr[i];

        // }
        // arr[arr.length-1]=temp;
        // System.out.println("Array after left rotation:");
        // System.out.println(java.util.Arrays.toString(arr));
        //stroring first k elements in temp array
        int[] temp=new int[arr.length];
        for(int j=0;j< k;j++){
            temp[j]=arr[j];
            
        }
        System.out.println(Arrays.toString(temp));
    //storing  elements after k in original array
    for(int i=0;i<n-k;i++){
        arr[i]=arr[i+k];

    }
    System.out.println(Arrays.toString(arr));

    //storing temp array elements in original array
    int m=0;
    for(int j=n-k;j<n;j++){
        arr[j]=temp[m];
        m++;
    }
    System.out.println("Array after k rotation:");
    System.out.println(Arrays.toString(arr));
    }
    
}
