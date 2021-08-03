package dsa450;
//Sort an array of 0s, 1s and 2s
import java.util.Arrays;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			sortArray(arr, n);
		}
		sc.close();
	}

	private static void sortArray(int[] arr, int n) {
		int low = 0, high = n-1, mid = 0;
        while(mid <= high){
            if(arr[mid]==0) {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } 
            else if(arr[mid]==1) {
                mid++;
            }
            else {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
	}

}
