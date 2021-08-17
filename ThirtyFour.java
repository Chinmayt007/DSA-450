package dsa450;
//Find the median
import java.util.Arrays;
import java.util.Scanner;

public class ThirtyFour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			System.out.println(findMedian(arr, n));
		}
		sc.close();
	}

	private static int findMedian(int[] arr, int n) {
		Arrays.sort(arr);
		int ans=0;
			// if size is odd
		if(n % 2 != 0)
			ans = arr[n / 2];
			// If size is even
		else
			ans = (arr[n/2] + arr[n/2-1])/2;
		return ans;
	}

}
