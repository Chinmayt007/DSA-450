package dsa450;
//Smallest sub-array with sum greater than x 
import java.util.Scanner;

public class Thirty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			int x=sc.nextInt();
			System.out.println(smallestArray(arr, n, x));
		}
		sc.close();
	}

	private static int smallestArray(int[] arr, int n, int x) {
		int curr_sum=0, min_len=n+1;
        int start=0, end=0;
        while (end<n)
        {
            while (curr_sum<=x && end<n)
                curr_sum += arr[end++];
            while (curr_sum>x && start<n)
            {
                if (end-start < min_len)
                    min_len=end-start;
                curr_sum-= arr[start++];
            }
        }
    	if(min_len>n)
    		return 0;
        return min_len;
	}

}
