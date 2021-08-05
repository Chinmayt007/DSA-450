package dsa450;

import java.util.Arrays;
import java.util.Scanner;

public class Twelve {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr1[]=new int[n];
			for(int i=0; i<n; i++)
				arr1[i]=sc.nextInt();
			int arr2[]=new int[m];
			for(int i=0; i<m; i++)
				arr2[i]=sc.nextInt();
			merge(arr1, n, arr2, m);
		}
		sc.close();
	}

	private static void merge(int[] arr1, int n, int[] arr2, int m) {
		int i, j, gap = n + m, tmp;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    tmp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = tmp;
                }
            }
            for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    tmp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = tmp;
                }
            }
            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        tmp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = tmp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
	}
	
	private static int nextGap(int gap) {
		if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
	}

}
