package dsa450;
//Maximum and minimum of an array using minimum number of comparisons
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			maxMin(arr, n);
		}
		sc.close();
	}

	private static void maxMin(int[] arr, int n) {
		int min=arr[0], max=arr[n-1];
		for(int i=1; i<n; i++) {
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Minimum Element: "+min+"\nMaximum Element: "+max);
	}

}
