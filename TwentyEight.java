package dsa450;
//Trapping Rain Water
import java.util.Scanner;

public class TwentyEight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			System.out.print(maxWater(arr, n));
		}
		sc.close();
	}

	private static int maxWater(int[] arr, int n) {
		int result=0,left=0, left_max=0, right=n-1, right_max=0;
		while(left<=right) {
			if(left_max>=right_max) {
				result=result+Math.max(0, right_max-arr[right]);
				right_max=Math.max(right_max, arr[right]);
				right=right-1;
			}
			else {
				result=result+Math.max(0, left_max-arr[left]);
				left_max=Math.max(left_max, arr[left]);
				left=left+1;
			}
		}
		return result;
	}

}
