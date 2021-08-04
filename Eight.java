package dsa450;
//Find Largest sum in contiguous sub-array
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			maxSubarraySum(arr, n);
		}
		sc.close();
	}

	private static void maxSubarraySum(int[] arr, int n) {
		int maxSum=arr[0], curSum=arr[0];
		for(int i=1; i<n; i++) {
			curSum=Math.max(curSum+arr[i], arr[i]);
			maxSum=Math.max(curSum, maxSum);
		}
		System.out.println(maxSum);
	}

}
