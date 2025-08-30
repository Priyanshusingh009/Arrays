import java.util.Arrays;

public class MEDIAN{
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {7,8};
        Arrays.sort(nums1);  
        Arrays.sort(nums2);  
        int[] mrg=new int[nums1.length+ nums2.length];
        for(int i =0;i<nums1.length;i++){
            mrg[i]=nums1[i];
        }
        for(int i =0;i<nums2.length;i++){
            mrg[nums1.length+i]=nums2[i];
        }
        Arrays.sort(mrg);
        int len1=nums1.length;
        int len2=nums2.length;
        double median=0;
        int index=(len1+len2)/2;
        if((len1+len2)%2!=0){
            median=mrg[index];
        }
        else{
            median=(double)(mrg[index-1]+mrg[index])/2;
        }
        System.out.println("The median is "+median);

    }
}