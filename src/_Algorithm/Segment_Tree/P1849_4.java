package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1849_4 {
	static int n,m,i,j,a[],t[],x,e,p;
	static void u() {							// i 인덱스, m 값, -j  크기의 반?-
		x=j+i-1;								// 크기의 반 + 인덱스 - 1 			ㅁ: 8+1-1 = 8
		t[x]=m;									// 계산 인덱스에 값					ㅁ: t[8]=0;
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);	// 계덱스 1보다 클 동안 2씩 나누며		아 시바 트리만드는거네 그냥
	}
	static int f(int x,int v) {
		if(x>=j)return x-j+1;
		int p=t[x*2];
		if(v<p)return f(x*2,v);
		return f(x*2+1,v-p);
	}
	public static void main(String[]z)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new int[n+1];
		for(i=1;i<n*2;i*=2);
		t=new int[i];
		j=i/2;
		m=1;
		for(i=0;i++<n;)u();
		m=0;
		for(;e++<n;) {
			p=Integer.parseInt(r.readLine());				//값 입력받고
			i=f(1,p);										//해당 값 탐색
			System.out.println("\t"+i);						//탐색해서 찾은 인덱스로
			a[i]=e;											//결과배열에 현재 카운트
			System.out.println("\t"+Arrays.toString(a));
			System.out.println("\t"+Arrays.toString(t));
			u();											//해당 인덱스 0 초기화, 트리 조정
			System.out.println("\t"+Arrays.toString(t));
		}
		for(i=0;i++<n;w.write(a[i]+"\n"));
		w.flush();
	}
}