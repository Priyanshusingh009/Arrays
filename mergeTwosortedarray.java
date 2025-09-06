import java.util.Arrays;

public class mergeTwosortedarray { 
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=nums1.length;
        int n=nums2.length;
        int[] result=new int[m+n];
        for(int i=0;i<m;i++){
        result[i]=nums1[i];
        }
        int i=0;
        for(int j=m;j<result.length;j++){
            result[j]=nums2[i];
            i++;
        }
        Arrays.sort(result);
        //we have to ignore zeroes
        int index=0;
        for(int k=0;k<result.length;k++){
            if (result[k] != 0) {
                result[index] = result[k];
                index++;
            }
        }
        // Step 2: Fill the rest with zeros
        while (index < result.length) {
            result[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(result));

    }
    
}
