import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] num = {1,2,3,4};
        System.out.println(num.length);

    }
}