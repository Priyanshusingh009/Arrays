import java.util.*;

public class binary_search {
    
    public static void main(String[] args) {//works only on sorted array
       System.out.println("ENTER THE ELEMENT YOU WANT TO SEARCH ");
        Scanner sc=new Scanner(System.in);
        
        int element=sc.nextInt();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int low,mid,high;
        low=0;
        high=arr.length-1;
        
        
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==element){
               
                System.out.print(element);
                System.out.println(" found at index "+mid);

            }
            if(arr[mid]<element){ 
                low=mid+1;
            }
           else{
                high=mid-1;
            }
            
        }
        

        

        
    }

    
}
    

