package dsa450;
//Count pairs with given sum
import java.util.HashMap;
import java.util.Scanner;

public class Seventeen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			int k=sc.nextInt();
			System.out.println(getPairsCount(arr, n, k));
		}
		sc.close();
	}

	private static int getPairsCount(int[] arr, int n, int k) {
		HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;
        for (int i = 0; i < n; i++) {
            if (hm.get(k - arr[i]) != null)
                twice_count += hm.get(k - arr[i]);
            if (k - arr[i] == arr[i])
                twice_count--;
        }
        return twice_count/2;
	}

}
