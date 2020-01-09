package BaekJoon;

import java.util.*;

public class P1927 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<Integer>l=new ArrayList();
		int n=s.nextInt(),m;
		for(;n-->0;) {
			m=s.nextInt();
			if(m==0)System.out.println(l.isEmpty()?0:l.remove(0));
			else {
				l.add(m);
				Collections.sort(l);
			}
		}
	}
}