package dsa450;
//Common Elements
import java.util.ArrayList;
import java.util.Scanner;

public class Eighteen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();
			ArrayList<Integer> arr1=new ArrayList<>();
			ArrayList<Integer> arr2=new ArrayList<>();
			ArrayList<Integer> arr3=new ArrayList<>();
			for(int i=0; i<n; i++)
				arr1.add(sc.nextInt());
			for(int i=0; i<m; i++)
				arr2.add(sc.nextInt());
			for(int i=0; i<k; i++)
				arr3.add(sc.nextInt());
			System.out.println(commonElements(arr1, arr2, arr3));
		}
		sc.close();
	}

	private static ArrayList<Integer> commonElements(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3) {
		ArrayList<Integer> res=new ArrayList<>();
		int i=0, j=0, k=0;
		while(i<arr1.size() && j<arr2.size() && k<arr3.size()) {
			if(arr1.get(i)==arr2.get(j) && arr2.get(j)==arr3.get(k)) {
				res.add(arr1.get(i));
				i++; j++; k++;
			}
			else if(arr1.get(i)<arr2.get(j))
				i++;
			else if(arr2.get(j)<arr3.get(k))
				j++;
			else
				k++;
				
		}
		return res;
	}

}
