package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P1764_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=5;
		int n=s.nextInt(),m=s.nextInt(),c=0;
//		String[] arr=new String[n];
		ArrayList<String> arr=new ArrayList<String>();
		ArrayList<String> r=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			arr.add(s.next());
		}
		for(int i=0;i<m;i++) {
			String j=s.next();
			if(arr.contains(j)) {
				c++;
				r.add(j);
			}
		}
		String[] result=(String[]) r.toArray();
		Arrays.sort(result);
		System.out.println(c);
		for(String i:result) System.out.println(i);
	}
}
