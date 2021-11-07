package _Algorithm.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1744 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j=0,z=0;
		List<Integer>l1=new ArrayList(),l2=new ArrayList();
		for(;i++<n;) {
			j=s.nextInt();
			if(j>0)l1.add(j);
			else if(j<0)l2.add(j);
			else z++;
		}
		Collections.sort(l1);
		Collections.sort(l2);
		while(!l1.isEmpty()) {
			i=l1.remove(l1.size());
			j=l1.remove(l1.size());
		}
		System.out.println(l1+"\n"+l2+"\n"+z);
	}

}
