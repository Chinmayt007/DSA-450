package dsa450;
//Cyclically rotate an array by one
import java.util.Arrays;
import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			cyclicRotate(arr, n);
		}
		sc.close();
	}

	private static void cyclicRotate(int[] arr, int n) {
		for(int i=n-1; i>0; i--) {
			int temp=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
