import java.util.Arrays;

public class plus1 {
    public static void main(String[] args) {
        int[] digits={9,9,9,9};
        int len=digits.length;
        
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Just add 1 if digit < 9
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i]=0;
        }
        int[] result = new int[len + 1];
        result[0] = 1; // Example: 999 → 1000
        System.out.println(Arrays.toString(result));
    
    }
    
}
