package dsa450;
//Longest consecutive subsequence
import java.util.HashSet;
import java.util.Scanner;

public class TwentyThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
				arr[i]=sc.nextInt();
			longestConsecutiveSubsequence(arr, n);
		}
		sc.close();
	}

	private static void longestConsecutiveSubsequence(int[] arr, int n) {
		HashSet<Integer> h = new HashSet<Integer>();
        int ans = 0;
        for (int i = 0; i < n; ++i)
            h.add(arr[i]);
        for (int i = 0; i < n; ++i)
        {
            if (!h.contains(arr[i] - 1))
            {
                int j = arr[i];
                while (h.contains(j))
                    j++;
                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        System.out.println(ans);
	}

}
