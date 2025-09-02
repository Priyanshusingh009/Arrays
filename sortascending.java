import java.util.Arrays;

public class sortascending {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        // Selection Sort
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;  // assume current index has the smallest number
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) { 
                    minIndex = j;  // found a smaller number
                }
            }
            // swap nums[i] with nums[minIndex]
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
