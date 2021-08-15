package dsa450;
//Given an array of size n and a number k, find all elements that appear more than n/k times
import java.util.HashMap;
import java.util.Scanner;

public class TwentyFour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			int k=sc.nextInt();
			findElements(arr, n, k);
		}
		sc.close();
	}

	private static void findElements(int[] arr, int n, int k) {
		HashMap<Integer, Integer> h=new HashMap<>();
		int check=n/k;
		System.out.println("n/k is: "+check);
		for(int i=0; i<n; i++) {
			if(!h.containsKey(arr[i]))
				h.put(arr[i], 1);
			else
				h.put(arr[i], h.get(arr[i])+1);
		}
		for(int i=0; i<n; i++) {
			if(h.containsKey(arr[i])) {
				if(h.get(arr[i])>check)
					System.out.println("Number: "+arr[i]+" Count: "+h.get(arr[i]));
				h.remove(arr[i]);
			}
		}
	}

}
