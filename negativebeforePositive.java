import java.util.Arrays;

public class negativebeforePositive {
    public static void main(String[] args) {
        int[] nums = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        Arrays.sort(nums);
        System.out.println("modified arrays is : " + Arrays.toString(nums));

    }
    
}
