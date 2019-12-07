package Merge;

import java.util.Scanner;

public class P3023_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),i=0,j,p,q;
		StringBuffer[]a=new StringBuffer[x],r=new StringBuffer[x*2];
		s.nextLine();
		for(;i<x;i++)a[i]=new StringBuffer(s.nextLine());
		p=s.nextInt()%x-1;
		q=s.nextInt()%y-1;
//		if(a[p].charAt(q)=='#')
//			a[p].replace(q,q,".");
//		else a[p].replace(q,q,"#");
		for(i=0;i<x;i++)
			r[i]=a[i].append(a[i].reverse());
		for(j=x-1;j>=0;)
			r[i++]=a[j--];
		for(StringBuffer z:r)
			System.out.println(z);
	}

}
