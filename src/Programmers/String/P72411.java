package Programmers.String;

import java.util.*;

public class P72411 {
	static HashMap<String,Integer>m=new HashMap();
	static HashSet<String>t=new HashSet();
	static char[]a,b,c;
	static int i,j,v[]=new int[11],h[];
	static public String[] solution(String[] orders, int[] course) {
		String[] answer = {};
		for(String s:orders) {
			a=s.toCharArray();
			b=new char[a.length];
			h=new int[a.length];
			o(0);
			System.out.println("\t"+t);
		}
		return answer;
	}
//	static void o(int x) {
//		
//	}
	static void o(int x) {
		c=b.clone();
		Arrays.sort(c);
		t.add(String.valueOf(c).trim());
		if(x<a.length) {
//			o(x+1);
			for(int i=0;i<a.length;i++) {
				if(h[i]<1) {
					b[x]=a[i];
					h[i]++;
//					Arrays.sort(b);
					System.out.print(b);
					System.out.println(" "+x+" "+Arrays.toString(h));
					o(x+1);
					h[i]--;
				}
			}
		}
	}
	public static void main(String[] args) {
		String[]a={"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[]o= {2,3,4};
		System.out.println(Arrays.toString(solution(a,o)));
	}

}
