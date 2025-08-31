import java.util.Arrays;

public class  sum3closest{
    public static void main(String[] args) {
        int[] arr={2,3,-1,3,4,5};
        Arrays.sort(arr);
        //{-1,2,3,3,4,5} sorted array
        int target=1;
        int closestSum=arr[0] + arr[1] + arr[2];
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int left=i+1;
            int right =arr.length-1;
            while (left < right) {

                // if (sum<cls && sum>=target) {
                //     cls=sum;

                // }
                // if(sum>cls && sum<=target){
                //     cls=sum;

                // }
                int sum = arr[i] + arr[left] + arr[right];

                int diff = sum - target;

                // If the difference is smaller (closer to target)

                if (diff < 0) diff = -diff;   // make it positive manually

                if (diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }    

        }
        System.out.println(closestSum);
    }
    
}