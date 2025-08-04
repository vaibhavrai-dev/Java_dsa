import java.util.Scanner;

public class Toggle {
     static void toggle(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char)(ch[i] + 32); 
            } else  {
                ch[i] = (char)(ch[i] - 32);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  

        char[] ch = s.toCharArray();  
        toggle(ch);  // 
        System.out.print(new String(ch));  
    }
}



