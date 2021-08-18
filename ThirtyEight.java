package dsa450;
//Spirally traversing a matrix
import java.util.ArrayList;
import java.util.Scanner;

public class ThirtyEight {

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
			System.out.println(printSpiral(arr, n, m));
		}
		sc.close();
	}

	private static ArrayList<Integer> printSpiral(int[][] matrix, int r, int c) {
		ArrayList<Integer> output = new ArrayList<Integer>();
        int row = 0;
        int col = 0;
        while(row<r && col<c)
        {
           //storing the elements of 1st row from the remaining rows, in a list.
           for(int i=col; i<c; i++)
               output.add(matrix[row][i]);
           row++;
           //storing elements of last column from remaining columns, in list.
           for(int i=row; i<r; i++)
               output.add(matrix[i][c-1]);
           c--;
           //storing the elements of last row from remaining rows, in a list.
            if(row<r)
            {
                for(int i=c-1; i>=col; --i)
                    output.add( matrix[r-1][i]);
                r--;
            }
           //storing elements of 1st column from the remaining columns, in list.
            if(col<c)
            {
                for(int i=r-1; i>=row; --i)
                    output.add( matrix[i][col]);
                col++;    
            }   
        }
        return output;
	}

}
