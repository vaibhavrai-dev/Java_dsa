import java.util.*;
public class Reverse{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();}

			reverse(arr);
			for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");}
	}
		
		
		
	
	public static void reverse(int[] arr) {
		// write your code here
		int n = arr.length;
		int sp = 0;
		int ep = n-1;
		  while(sp<ep){
			int temp=arr[sp];
			arr[sp]=arr[ep];
			arr[ep]=temp;
			sp++;
			ep--;
		  }

	}
}
