//package Method;
import java.util.*;
public class Algebra {
    public static int Algebra(int x,int y) {
        int ans = x+y;
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first value :");
        int x=sc.nextInt();
        System.out.println("enter second value :");
        int y=sc.nextInt();
        System.out.println("the sum is:"+Algebra(x,y));
        //Algebra(x, y); 
    }
    
}

