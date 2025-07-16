import java.util.Scanner;

class Algebra1 {
    int add(int a, int b){
    int ans = a + b;
    return ans;
    }
}

public class Main{
    public static void main(String[] args) {
        Algebra1 obj = new Algebra1();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of input number is");
        int ans = obj.add(a , b);
        System.out.println(ans);
    }
}                           

