import java.util.Arrays;

public class mergeTwosortedarray { 
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={4,5,0};
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
        System.out.println(Arrays.toString(result));
    }
    
}
