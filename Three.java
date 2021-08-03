package dsa450;
//Kth smallest element
import java.util.Arrays;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			int k=sc.nextInt();
			kSmallest(arr, n, k);
		}
		sc.close();
	}

	private static void kSmallest(int[] arr, int n, int k) {
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}

}
