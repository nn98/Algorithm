package BaekJoon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class P1302 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m;
		HashMap<String,Integer>t=new HashMap();
		String r="",p;
		for(;n-->0;) {
			String a=s.next();
			if(t.get(a)==null)t.put(a,1);
			else t.put(a,t.get(a)+1);
		}
		TreeMap<String,Integer>h=new TreeMap(t);
		Iterator<String>i=h.keySet().iterator();
		while(i.hasNext()) {
			p=i.next();
			m=t.get(p);
			if(n<m) {
				r=p;
				n=m;
			}
		}
		System.out.println(r);
	}

}
