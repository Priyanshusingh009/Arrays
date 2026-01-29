public class secondLargest {
    public static void main(String[] args) {
        int[] arr={34,67,23,89,2,45,90,12};
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("The second largest element is: "+secondLargest);
    }
    
}
