package dsa450;
//Palindrome String
import java.util.Scanner;

public class FiftyOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String a =sc.next();
			System.out.println(checkPalindrome(a));
		}
		sc.close();
	}

	private static int checkPalindrome(String S) {
		int high=S.length()-1;
        for(int i=0; i<S.length()/2; i++){
            char ch1=S.charAt(i);
            char ch2=S.charAt(high);
            if(ch1==ch2)
                high--;
            else
                return 0;
        }
        return 1;
	}

}
