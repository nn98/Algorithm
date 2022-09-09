package _Algorithm.Two_Pointer;
// 시발 시간초과
import java.io.*;
import java.util.*;

public class P2832 {
	static int n,a[],i,j,k,p,u,R;
	static List<Integer>l=new ArrayList();
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		StringTokenizer t=new StringTokenizer(r.readLine());
		//		a=new int[n+1];
		//		a[n]=n+1;
		//		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(;i++<n;l.add(Integer.parseInt(t.nextToken())));
		l.add(n+1);
		//		l.add(0,10);
//		System.out.println(l);
		for(;++k<=n;) {
//			System.out.println("k: "+k+" j: "+j);
//			if(l.get(k-1)>l.get(k))j=k;
			if(l.get(k-1)<l.get(k)) {
				for(i=k-1;i>=j;p=l.get(i),l.set(i,l.get(j)),l.set(j,p),i--,j++);
				j=k;
				u++;
			}
		}
//		System.out.println(l);
		for(i=0;++i<n;) {
			for(j=i-1;j>0&l.get(j)>l.get(i);j--);
//			System.out.println(i+" "+j);
			if(i-j>1) {
				p=l.remove(i);
				l.add(j<1?j:j+1,p);
				u+=i-((j<1?j:j-1)+1);
			}
//			System.out.println(l);
		}
		System.out.println(u);
//				for(;++k<=n;) {
//					System.out.println("k: "+k+" j: "+j);
//		//			if(a[k-1]>a[k])j=k;
//					if(a[k-1]<a[k]) {
//						for(i=k-1;i>=j;p=a[i],a[i]=a[j],a[j]=p,i--,j++);
//						j=k;
//					}
//				}
		//		System.out.println(Arrays.toString(a));
//				for(i=0;++i<n;) {
//					for(j=i-1;j>0&a[j]>a[i];j--);
//					System.out.println(i+" "+j);
//					u+=i-(j+1);
//				}
//				System.out.println(u);
	}

}
