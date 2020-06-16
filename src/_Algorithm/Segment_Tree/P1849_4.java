package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1849_4 {
	static int n,m,i,j,a[],t[],x,e,p,q,k;
	static void u() {							// i 인덱스, m 값, -j  크기의 반?-
		System.out.println(Arrays.toString(t));
		x=j+i-1;								// 크기의 반 + 인덱스 - 1 			ㅁ: 8+1-1 = 8
		t[x]=m;									// 계산 인덱스에 값					ㅁ: t[8]=0;
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);	// 계덱스 1보다 클 동안 2씩 나누며		아 시바 트리만드는거네 그냥
		// ㄴㄴ 계덱스 1 즉 탑까지 다 돌면서 트리 생성
	}
//	create and update OK
	
	static int f(int x,int v) {					// x index, v value, j mid index
		System.out.println(x+" "+v);
//		ㅁ: 1, 5	ㄹ: 3, 1	ㅂ: 6, 1	ㅍ: 13, 0
		if(x>=j)return x-j+1;					// 인덱스 중간값보다 크거나 같으면 중간만큼 빼고 +1	ㅁ: 8==1
//		ㄴ		ㄴ		ㄴ		ㅇ: 13-8+1 = 6
		int p=t[x*2];							// p 트리 왼쪽노드값
//		ㅔ = 4	ㅔ = 2	ㅔ = 1
		if(v<p)return f(x*2,v);					// 대상이 작으면 왼쪽노드에,
//		ㄴ		ㅇ		ㅂ: 6, 1	ㅍ: 14, 0
		return f(x*2+1,v-p);					// 크거나 같으면 오른쪽노드로	가는데 왜 p를 빼 시벌
//		ㄹ: 3, 1	ㅍ: 13, 0
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
		System.out.println(Arrays.toString(t));
		m=0;
		for(;e++<n;) {
			p=Integer.parseInt(r.readLine());				//값 입력받고
			i=f(1,p);										//해당 값 탐색
			System.out.println("\t"+i);						//탐색해서 찾은 인덱스로
			a[i]=e;											//결과배열에 현재 카운트
			System.out.println("\t"+Arrays.toString(a));
//			System.out.println("\t"+Arrays.toString(t));
			u();											//해당 인덱스 0 초기화, 트리 조정
			for(k=1;k<=j;k*=2) {
				for(q=k;q<k*2;System.out.print(t[q++]+" "));
				System.out.println();
			}
		}
		for(i=0;i++<n;w.write(a[i]+"\n"));
		w.flush();
	}
}