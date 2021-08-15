package dsa450;
//Find The Triplet Sum in Array
import java.util.Arrays;
import java.util.Scanner;

public class TwentySeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			int k=sc.nextInt();
			System.out.println(tripletSum(arr, n, k));
		}
		sc.close();
	}

	private static boolean tripletSum(int[] arr, int n, int k) {
		int l, r;
        Arrays.sort(arr);
        for (int i = 0; i<n-2; i++) { 
            l = i+1; 
            r = n-1; 
            while (l < r) { 
                if (arr[i]+arr[l]+arr[r]==k)
                    return true;
                else if (arr[i]+arr[l]+arr[r]<k) 
                    l++; 
                else
                    r--; 
            } 
        } 
        return false;
	}

}
