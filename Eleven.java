package dsa450;
//Find the Duplicate Number in an array
import java.util.Arrays;
import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			System.out.println(findDuplicate(arr, n));
		}
		sc.close();
	}

	private static int findDuplicate(int[] arr, int n) {
		int num=1;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1])
                num=arr[i];
        }
        return num;
	}

}
