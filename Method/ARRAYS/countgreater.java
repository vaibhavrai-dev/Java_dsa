
import java.util.*;


    public class countgreater {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(countGreater(arr,n));
	}
	public static int countGreater(int[] arr,int n){
		int max=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max){max=arr[i];}
		}

		int maxcount=0;
			for(int i=0;i<n;i++){
				if(arr[i]==max){maxcount++;}
			}
			return n-maxcount;
	}
}

