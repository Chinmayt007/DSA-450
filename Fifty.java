package dsa450;

import java.util.Arrays;
import java.util.Scanner;

public class Fifty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			char ch[]=s.toCharArray();
			reverseString(ch);
		}
		sc.close();
	}

	private static void reverseString(char[] s) {
		int high=s.length-1;
        for(int i=0; i<s.length/2; i++){
            char temp=s[i];
            s[i]=s[high];
            s[high]=temp;
            high--;
        }
        System.out.println(Arrays.toString(s));
	}

}
