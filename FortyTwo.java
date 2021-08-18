package dsa450;
//Median in a row-wise sorted Matrix
import java.util.Arrays;
import java.util.Scanner;

public class FortyTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[][]=new int[n][m];
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++)
					arr[i][j]=sc.nextInt();
			}
			System.out.println(findMedian(arr, n, m));
		}
		sc.close();
	}

	private static int findMedian(int[][] m, int r, int c) {
		int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<r ; i++)
        {
            if(m[i][0] < min)
                min = m[i][0];
            if(m[i][c-1] > max)
                max = m[i][c-1];
        }
        int desired = (r * c + 1) / 2;
        while(min < max)
        {
            int mid = min + (max - min) / 2;
            int place = 0;
            int get = 0;
            for(int i = 0; i < r; ++i)
            {
                get = Arrays.binarySearch(m[i], mid);
                if(get < 0)
                    get = Math.abs(get) - 1;
                else
                {
                    while(get < m[i].length && m[i][get] == mid)
                        get += 1;
                }
                place = place + get;
            }
            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
	}

}
