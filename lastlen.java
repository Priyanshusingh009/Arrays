import java.util.Arrays;

public class lastlen {
    public static void main(String[] args) {
        String str="hello world";
        String[] arr=str.split("");
        //System.out.println(Arrays.toString(arr));
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            count++;
            if(arr[i].equals(" ")){
                count--;
                System.out.println("Last word contains "+count+" letters");
                break;

            }
            

        }
        
    }
    
}/*s = s.trim();

        // Find last space in the string
        int lastSpace = s.lastIndexOf(' ');

        // Last word length = from last space to end
        return s.length() - lastSpace - 1; */
