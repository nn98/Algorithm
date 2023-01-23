package BaekJoon.Two_Pointer;

// �� ������ �̸����� �����غ��� ������ s ���� e �ΰ� �ϳ��� ���������鼭 ���� ��
// ����, �ð��ʰ�

import java.io.*;
import java.util.*;
public class P2531 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int n=Integer.parseInt(t.nextToken()),d=Integer.parseInt(t.nextToken()),
				k=Integer.parseInt(t.nextToken()),c=Integer.parseInt(t.nextToken()),
				a[]=new int[n],i=0,j,R=0,p;
		for(;i<n;i++) {
			a[i]=Integer.parseInt(r.readLine());
			if(i>=k-1) {
				HashSet<Integer>s=new HashSet();
				for(j=i,p=k;p>0;s.add(a[j--]),p--);
				s.add(c);
//				System.out.println("\nfrom "+(j+1)+" to "+i+" kind: "+s.size());
				R=R>s.size()?R:s.size();
			}
		}
		for(i=0;i<k;i++) {
			HashSet<Integer>s=new HashSet();
			s.add(c);
			for(p=j=i;j<k+i;j++) {
				s.add(a[p--]);
				p=p<0?n+p:p;
			}
//			System.out.println("from "+j+" to "+p+" kind - "+s.size());
			R=R>s.size()?R:s.size();
		}
		System.out.println(R);
	}

}
