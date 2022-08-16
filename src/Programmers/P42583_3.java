package Programmers;

import java.util.Arrays;

public class P42583_3 {
	static public int solution(int b, int w, int[] t) {
		int a=1,j,r=1,i=0,v=0,c[]=new int[30];
		for(;i<t.length;r++) {
			if(c[r]<=w) {
				for(j=0;j<b;c[j++]+=t[i]);
				i++;
			}
			System.out.println(Arrays.toString(c));
		}
		return r;
	}
	public static void main(String[] args) {
		System.out.println(solution(2,10,new int[] {7,4,5,6}));
		System.out.println(solution(100,100,new int[] {10}));
		System.out.println(solution(100,100,new int[] {10,10,10,10,10,10,10,10,10,10}));
	}

}
