package dsa450;
//Find maximum product sub-array
import java.util.Scanner;

public class TwentyTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			System.out.println(maxProduct(arr, n));
		}
		sc.close();
	}

	private static int maxProduct(int[] arr, int n) {
		int min = arr[0];
        int max = arr[0];
        int maxProduct = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);
            maxProduct = Math.max(maxProduct, max);
        }
        return maxProduct;
	}

}
