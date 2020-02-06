package BaekJoon;
//https://jennylee4517.github.io/ps/2981-%EA%B2%80%EB%AC%B8/
//채점 86퍼에서 시발 뭘 쳐 하는 건데 개 좆
//만든새끼 대가리 깨도 뮈죄
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class P2981_5 {
	static int G(int a,int b) {
		if(a%b==0)return b;
		return G(b,a%b);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],i=0,v=0;
		for(;i<n;a[i++]=Integer.parseInt(r.readLine()));
		Arrays.sort(a);
		for(i=1;i<n;a[i-1]=a[i]-a[i++-1]);
		//		System.out.println(Arrays.toString(a));
		if(n==2)v=a[0];
		else {
			v=G(a[0],a[1]);
			for(i=2;i<n-1;v=G(v,a[i++]));
		}
		
//		시발 약수
//		단순반복	시간초과
//		for(i=2;i<=v;w.write(v%i==0?i+" ":""),i++);
		
//		배열
//				boolean[]b=new boolean[v+1];
//				for(i=0;i++<v/2;b[i]=b[v/i]=v%i==0);
//				for(i=1;++i<=v;w.write(b[i]?i+" ":""));
				//		System.out.println(Arrays.toString(b));
				//		System.out.println(v);
		
//		리스트
		List<Integer>l=new LinkedList();
		l.add(v);
		for(i=2;i<=Math.sqrt(v);i++)
			if(v%i==0) {
				if(i==v/i)l.add(i);
				else {
					l.add(i);
					l.add(v/i);
				}
			}
		Collections.sort(l);
		for(int j:l)w.write(j+" ");
		w.flush();
	}
}