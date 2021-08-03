package dsa450;
//Write a program to reverse an array
import java.util.Arrays;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			reverse(arr, 0, n-1);
			
		}
		sc.close();
	}

	private static void reverse(int[] arr, int start, int end) {
		int temp;
		while(start<=end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start=start+1; end=end-1;
		}
			System.out.println(Arrays.toString(arr));
	}

}
