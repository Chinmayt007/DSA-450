package dsa450;
//Array Subset of another array
import java.util.HashSet;
import java.util.Scanner;

public class TwentySix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a1[]=new int[n];
			int a2[]=new int[m];
			for(int i=0; i<n; i++)
				a1[i]=sc.nextInt();
			for(int i=0; i<m; i++)
				a2[i]=sc.nextInt();
			System.out.println(arraySubsetOfAnotherArray(a1, n, a2, m));
		}
		sc.close();
	}

	private static String arraySubsetOfAnotherArray(int[] a1, int n, int[] a2, int m) {
		HashSet<Integer> h=new HashSet<>();//Change Integer to Long to run in GFG Compiler
		for(int i=0; i<n; i++)
			h.add(a1[i]);
		for(int i=0; i<m; i++) {
			if(h.contains(a2[i]))
				continue;
			else
				return "No";
		}
		return "Yes";
	}

}
