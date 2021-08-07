package dsa450;
//Count the inversion
import java.util.Scanner;

public class Fiveteen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			long arr[]=new long[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			System.out.println(countInversion(arr, n));
		}
		sc.close();
	}

	private static int countInversion(long[] arr, int n) {
		long temp[] = new long[(int)n];
        return (int) _mergeSort(arr, temp, 0, n - 1); 
    }
    static long _mergeSort(long arr[], long temp[], 
        long left, long right)
    {
        long mid, inv_count = 0; 
        if (right > left) { 
            mid = (right + left) / 2;
            inv_count = _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid + 1, right);
            inv_count += merge(arr, temp, left, mid + 1, right); 
        } 
        return inv_count; 
    }
    static long merge(long arr[], long temp[], long left, long mid, long right) 
    { 
        long i, j, k; 
        long inv_count = 0; 
        i = left;
        j = mid; 
        k = left; 
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[(int)i] <= arr[(int)j]) { 
                temp[(int)k++] = arr[(int)i++]; 
            } 
            else { 
                temp[(int)k++] = arr[(int)j++]; 
                inv_count = inv_count + (mid - i); 
            } 
        } 
        while (i <= mid - 1)  
            temp[(int)k++] = arr[(int)i++]; 
        while (j <= right) 
            temp[(int)k++] = arr[(int)j++]; 
        for (i = left; i <= right; i++) 
            arr[(int)i] = temp[(int)i]; 
  
        return inv_count; 
    }
}
