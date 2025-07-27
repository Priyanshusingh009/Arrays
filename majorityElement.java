/*A majority element is an element that appears more than n/2 times 
in an array, where n is the size of the array. */
import java.util.Arrays;
public class majorityElement{
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 2, 3, 2, 2};

        //  Sort the array
        Arrays.sort(nums);

        //  The majority element will be at the middle index
        int majorityElement = nums[nums.length / 2];

        //  Count how many times this element appears
        int count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            System.out.println("Majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }


        
        
    }
}