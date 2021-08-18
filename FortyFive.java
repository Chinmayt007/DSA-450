package dsa450;
//Rotate a matrix by 90 degree in clockwise direction without using any extra space
import java.util.Scanner;

public class FortyFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[][]=new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			matrixRotation(arr, n);
		}
		sc.close();
	}

	private static void matrixRotation(int[][] arr, int n) {
		for (int i=0; i<n/2; i++)
	    {
	        for (int j=i; j<n-i-1; j++)
	        {
	            int temp= arr[i][j];
	            arr[i][j]= arr[n-1-j][i];
	            arr[n-1-j][i]= arr[n-1-i][n-1-j];
	            arr[n-1-i][n-1-j]= arr[j][n-1-i];
	            arr[j][n-1-i]= temp;
	        }
	    }
		for (int[] row : arr) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
		}
	}

}
