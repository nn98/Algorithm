package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2485 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],m=Integer.MAX_VALUE,i=0,j;
		for(;i<n;a[i++]=s.nextInt());
		List<Integer>l=new ArrayList();
		for(i=0;i<n;i++) {
			if(i>0) {
				j=a[i]-a[i-1];
				m=m<j?m:j;
				l.add(j);
			}
		}
		j=0;
		for(int v:l)j+=v>m?v/m-1:0;
		System.out.println(j);
	}

}
