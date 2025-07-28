import java.util.Arrays;

public class leftzeroRighrOne {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,0};
        int zero=0;
        int one=0;
        int len=arr.length;
        for(int i:arr){
            if(i==0){
                zero++;
            }
            else if(i==1){
                one++;
            }
        }
        int[] new_arr=new int[len];
        for(int j=0;j<len;j++){
            if(j<zero ){
                new_arr[j]=0;
            }
            else{ 
                if(j >= zero && j < zero + one){
                    new_arr[j]=1;
                }
            }
        }
        System.out.println("the new modified array is "+Arrays.toString(new_arr));
    }
}
