public class closeZero {
    public static void main(String[] args) {
    int[] arr={2,3,5,4,6,2,1,3};
    int sumzero=arr[0]+arr[1];
    String pair=" ";
    for(int i=1;i<arr.length-1;i++){
       int sum=arr[i+1]+arr[i];
       if(sum<sumzero){
        sumzero=sum;
        pair="pairs are  "+arr[i+1] +" and "+arr[i];
        
       }
    }
    System.out.println(pair);
    System.out.println("closest sum to zero is = "+sumzero);
    }
}
//git commit-m"find pair whose sum is near to zero"