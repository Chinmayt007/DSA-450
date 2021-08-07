package dsa450;
//Best Time to Buy and Sell Stock
import java.util.Scanner;

public class Sixteen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			System.out.println(bestBuy(arr, n));
		}
		sc.close();
	}

	private static int bestBuy(int[] arr, int n) {
		int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minprice)
                minprice = arr[i];
            else if (arr[i] - minprice > maxprofit)
                maxprofit = arr[i] - minprice;
        }
        return maxprofit;
	}

}
