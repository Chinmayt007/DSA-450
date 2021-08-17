package dsa450;
//Three way partitioning
import java.util.Scanner;

public class ThirtyOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			threeWayPartition(arr, n, a, b);
		}
		sc.close();
	}

	private static void threeWayPartition(int[] arr, int n, int a, int b) {
		int start = 0, end = n-1, i=0;
        while(i<=end)
        {
            if(arr[i]<a)
            {
                int temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
                i++;
            }
            else if(arr[i]>b)
            {
                int temp=arr[end];
                arr[end]=arr[i];
                arr[i]=temp;
                end--;
            }
            else
               i++;
        }
	}

}
