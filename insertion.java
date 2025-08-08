import java.util.*;
public class insertion {
    public static void main(String[] args) {
        
    
        int[] arr=new int[15];
        arr[0]=2;
        arr[1]=3;
        arr[2]=7;
        arr[3]=0;
        arr[4]=5;
        arr[5]=6;
        System.out.println(Arrays.toString(arr));
        int ins=5;
        int index=2;
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0 && arr[i-1]!=0 ||arr[i]!=0){
                count++;
            }
        }
        for(int j=count+1;j>index;j--){
            arr[j]=arr[j-1];
            
            }
        arr[index]=ins;
        System.out.println(Arrays.toString(arr));

        }
        


        

}

