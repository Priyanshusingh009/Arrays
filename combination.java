import java.util.*;
public class combination {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n:");
    int n=sc.nextInt();
    System.out.println("Enter r:");
    int r=sc.nextInt();
    long res=1;
    for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
    }
    System.out.println("The combination is : "+res);
    }
    
}
