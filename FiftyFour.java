package dsa450;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FiftyFour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String str=sc.next();
			findDuplicate(str);
		}
		sc.close();
	}

	private static void findDuplicate(String str) {
		int l=str.length();
		HashMap<Character, Integer> map=new LinkedHashMap<>();
		for(int i=0; i<l; i++) {
			char ch=str.charAt(i);
			if(!map.containsKey(ch))
				map.put(ch, 1);
			else
				map.put(ch, map.get(ch)+1);
		}
		for (Map.Entry mapElement : map.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
            if (value > 1)
                System.out.println(key + " count = " + value);
        }
	}

}
