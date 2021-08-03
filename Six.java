package dsa450;
//Union of two arrays
import java.util.HashSet;
import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[m];
			for(int i=0; i<n; i++)
				a[i]=sc.nextInt();
			for(int i=0; i<m; i++)
				b[i]=sc.nextInt();
			doUnion(a, n, b, m);
		}
		sc.close();
	}

	private static void doUnion(int[] a, int n, int[] b, int m) {
		HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0; i<n; i++){
        	h.add(a[i]);
        }
        for(int i=0; i<m; i++){
        	h.add(b[i]);
        }
        System.out.println(h.size());
	}

}
