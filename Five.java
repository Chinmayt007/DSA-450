package dsa450;
//Move all negative numbers to beginning and positive to end with constant extra space
import java.util.Arrays;
import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			moveNegative(arr, n);
		}
		sc.close();
	}

	private static void moveNegative(int[] arr, int n) {
		int low=0, mid=0, high=n-1;
		while(mid<=high) {
			if(arr[mid]<0) {
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low=low+1;
				mid=mid+1;
			}
			else
				mid=mid+1;
		}
		System.out.println(Arrays.toString(arr));
	}

}