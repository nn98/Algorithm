package BaekJoon;

import java.util.*;
public class P11728{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,j=0,a[]=new int[n],b[]=new int[m];
		StringBuffer r=new StringBuffer();
		for(;i<n;a[i++]=s.nextInt());
		for(;j<m;b[j++]=s.nextInt());
		i=j=0;
		while(i<n||j<m) {
			if(i==n)r.append(b[j++]+" ");
			else if(j==m)r.append(a[i++]+" ");
			else {
				r.append((a[i]<b[j]?a[i++]:b[j++])+" ");
			}
		}
		System.out.print(r);
	}
}