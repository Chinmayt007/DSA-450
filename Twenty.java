package dsa450;
//Find a sub-array with sum equal to zero
import java.util.HashSet;
import java.util.Scanner;

public class Twenty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			System.out.println(findSubArray(arr, n));
		}
		sc.close();
	}

	private static boolean findSubArray(int[] arr, int n) {
		HashSet<Integer> h=new HashSet<>();
		int sum=0;
		for (int i = 0; i<n; i++)
        {
            sum +=arr[i];
            if (arr[i]==0 || sum==0 || h.contains(sum))
                return true;
            h.add(sum);
        }
        return false;
	}

}
