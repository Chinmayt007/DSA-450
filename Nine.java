package dsa450;
//Minimize the maximum difference between heights
import java.util.Arrays;
import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int k=sc.nextInt();
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			getMinDiff(arr, n, k);
		}
		sc.close();
	}

	private static void getMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);
		int ans=arr[n-1]-arr[0];
		int s=arr[0]+k;
		int l=arr[n-1]-k;
		int min, max;
		for(int i=0; i<n-1; i++) {
			min=Math.min(s, arr[i+1]-k);
			max=Math.max(l, arr[i]+k);
			if(min<0)
				continue;
			ans=Math.min(ans, max-min);
		}
		System.out.println("Maximum difference is: "+ans);
	}

}
