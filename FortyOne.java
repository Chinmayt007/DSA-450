package dsa450;
//Search a 2D Matrix
import java.util.Scanner;

public class FortyOne {

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
			int target=sc.nextInt();
			System.out.println(search(arr, target));
		}
		sc.close();
	}

	private static boolean search(int[][] arr, int target) {
		for(int[] nums:arr){
            int left = 0;
            int right = nums.length-1;
            while(left<=right){
                int middle = (left+right)/2;
                if(nums[middle]==target) 
                	return true;
                else if(nums[middle]>target) 
                	right = middle-1;
                else 
                	left = middle+1;
            }
        }
        return false;
	}

}
