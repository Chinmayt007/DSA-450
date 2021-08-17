package dsa450;
//Chocolate Distribution Problem
import java.util.Arrays;
import java.util.Scanner;

public class TwentyNine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			int m=sc.nextInt();
			findMinDiff(arr, n, m);
		}
		sc.close();
	}

	private static void findMinDiff(int[] arr, int n, int m) {
			Arrays.sort(arr);
			int start = 0,end =0;
			int mind = Integer.MAX_VALUE;
			for(int i=0;i+m-1<n;i++)
			{
				int diff = arr[i+m-1] - arr[i];
				if(mind>diff)
				{
					mind=diff;
					start=i;
					end=i+m-1;
				}
			}
			System.out.println(arr[end]-arr[start]);
	}

}
