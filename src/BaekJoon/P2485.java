package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2485 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],m=Integer.MAX_VALUE,i=0,j;
		List<Integer>l=new ArrayList();
		for(;i<n;) {
			a[i++]=s.nextInt();
			if(i>1) {
				j=a[i]-a[i-1];
				m<j?m:j;
				l.add(j);
			}
		}
		
	}

}
