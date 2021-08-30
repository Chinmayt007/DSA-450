package dsa450;
//Row with max 1s
import java.util.Scanner;

public class FortyThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[][]=new int[n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			findRow(arr, n, m);
		}
		sc.close();
	}

	private static void findRow(int[][] arr, int n, int m) {
		int r = 0;             
        int c = m-1;
        int max_row_index=-1;
        while(r<n && c>=0)
        {
            if(arr[r][c]==1)
            {
                max_row_index = r;
                c--;
            }
            else
                r++;
        }
        System.out.println(max_row_index);
	}

}
