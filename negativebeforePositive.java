import java.util.Arrays;

public class negativebeforePositive {
    public static void main(String[] args) {
         int[] nums = {-4, 8, 6, -5, -6, -2, 1, 2, 3, -11};

        int[] result = new int[nums.length];
        int index = 0;

        //  add all negative numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                result[index] = nums[i];
                index++;
            }
        }

        // add all positive numbers (and 0 if needed)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                result[index] = nums[i];
                index++;
            }
        }

        System.out.println("modified arrays is : " + Arrays.toString(result));

    }
    
}
