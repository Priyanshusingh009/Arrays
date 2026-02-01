public class checkroted {
    public boolean check2(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        // check last and first element (rotation case)
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }


    ///////////////////////////////////////////////////////////////////////////////////
        public boolean check(int[] nums) {
        if(nums.length==2|| nums.length==1|| nums[0]-nums[nums.length-1]==0){
            return true;
        }
        for(int i=0;i<nums.length-2;i++){
            int dff=nums[i+1]-nums[i];
            if(dff>1 || dff<-1||nums[i]>nums[i+1]){
               return false;
               

            }else{
                return true;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        checkroted obj=new checkroted();
        int[] arr={3,4,5,1,2};
        System.out.println(obj.check2(arr));
        System.out.println( obj.check(arr));

    }
    
}
