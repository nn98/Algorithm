package BaekJoon.Two_Pointer;

// ������ ��1������ �Ǵµ�

import java.io.*;
import java.util.*;

public class P2531_2 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int n=Integer.parseInt(t.nextToken()),d=Integer.parseInt(t.nextToken()),
				k=Integer.parseInt(t.nextToken()),c=Integer.parseInt(t.nextToken()),
				a[]=new int[n],i=0,j=k-1,R=0,b[]=new int[d+1];
		for(;i<n;i++) {
			a[i]=Integer.parseInt(r.readLine());
		}
		HashSet<Integer>h=new HashSet();
		h.add(c);
		for(i=0;i<=j;b[a[i]]+=h.contains(a[i])?1:0,h.add(a[i++]));
//		System.out.println(h.toString());
//		System.out.println(Arrays.toString(b));
		for(i=0;i<n;i++) {
//			System.out.println(h.toString());
			R=R>h.size()?R:h.size();
			++j;
			j%=n;
			b[a[j]]+=h.contains(a[j])?1:0;
			h.add(a[j]);
			if(b[a[i]]>0)b[a[i]]--;
			else if(a[i]!=c)h.remove(a[i]);
		}
		System.out.println(R);
	}

}
