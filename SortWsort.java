import java.util.Arrays;

public class SortWsort {
    public static void main(String[] args) {
        //descending sorted array
        int[] nums={2,0,3,2,1,1,0};
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
