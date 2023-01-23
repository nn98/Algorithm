package BaekJoon.Greedy;

//EZ

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1744 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,z=0,r=0;
		List<Integer>l1=new ArrayList(),l2=new ArrayList();
		for(;i++<n;) {
			j=s.nextInt();
			if(j>0)l1.add(j);
			else if(j<0)l2.add(j);
			else z++;
		}
		Collections.sort(l1);
		Collections.sort(l2);
		while(l1.size()>1) {
			i=l1.remove(l1.size()-1);
			j=l1.remove(l1.size()-1);
			if(i>1&j>1)	r+=i*j;
			else r+=i+j;
		}while(!l1.isEmpty())r+=l1.remove(l1.size()-1);
		while(l2.size()>1) {
			i=l2.remove(0);
			j=l2.remove(0);
			r+=i*j;
		}while(!l2.isEmpty()) {
			i=l2.remove(0);
			r+=z-->0?0:i;
		}
		System.out.println(r);
	}

}
