package dsa450;
//Minimum swaps and K together
import java.util.Scanner;

public class ThirtyTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			int k=sc.nextInt();
			minimumSwaps(arr, n, k);
		}
		sc.close();
	}

	private static void minimumSwaps(int[] arr, int n, int k) {
	    int count = 0;
	    for (int i = 0; i < n; i++)
	    	if (arr[i] <= k)
	    		count++;
	    int bad = 0;
	    for (int i = 0; i < count; i++)
	    	if (arr[i] > k)
	    		bad++;
	    int ans=bad;
	    for (int i=0, j=count; j<n; i++, j++) {
	    	if (arr[i] > k)
	    		bad--;
	    	if (arr[j] > k)
	    		bad++;
	    ans = Math.min(ans, bad);
	    }
	    System.out.println(ans);
	}

}
