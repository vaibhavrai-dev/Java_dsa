import java.util.Scanner;
public class Mainain {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		// write your code here
		int ans1=fact(n);
		int ans2=fact(n)/fact(n-r);
		int ans3=fact(n)/(fact(r)*fact(n-r));

		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);

	}
	public static int fact(int n){
		int ans = 1;
		for (int i=1;i<=n;i++){
		ans=ans*i;
		}
	return ans; 
	}
}
