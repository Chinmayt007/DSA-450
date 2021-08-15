package dsa450;
//Maximum profit by buying and selling a share at most twice
import java.util.Scanner;

public class TwentyFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			maxProfit(arr, n);
		}
		sc.close();
	}

	private static void maxProfit(int[] arr, int n) {
		int profit=0;
		for(int i=1; i<n; i++) {
			int t=arr[i]-arr[i-1];
			if(t>0)
				profit+=t;
		}
		System.out.println("Max Profit: "+profit);
	}

}
