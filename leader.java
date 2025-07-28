public class leader {
    public static void main(String[] args) {
        int[] arr={2,8,7,2,3,5};
        int lead=0;
        for(int i =0;i<arr.length;i++){
            
            for(int j =1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    break;

                }
                else{
                    if(lead<arr[i])
                    lead=arr[i];

                    
                }
            }
           
        }
    System.out.println("LEADERE= "+lead);
         
    }

}
    

