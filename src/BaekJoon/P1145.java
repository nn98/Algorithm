package BaekJoon;

import java.util.Arrays;

public class P1145 {

	public static void main(String[] args) {
		int i=0,a[]=new int[5],v;
		for(String t:new java.util.Scanner(System.in).nextLine().split(" "))a[i++]=Integer.parseInt(t);
		Arrays.sort(a);
		for(i=a[0];;i++) {
			v=0;
			for(int j:a)
				if(i%j==0)v++;
			if(v>2) {
				System.out.print(i);
				return;
			}
		}
	}

}
