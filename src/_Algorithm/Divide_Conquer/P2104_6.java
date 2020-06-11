package _Algorithm.Divide_Conquer;
//https://navy-apple.com/algorithms/BOJ/2104
import java.io.*;
import java.util.*;
public class P2104_6{
	static int n,i;
	static long[]a=new long[100001];
	static long o(int f,int t) {
		if(f==t)return a[f]*a[f];							// 한칸은 제곱 리턴 			+
		int m=(f+t)>>1,l=m,r=m;								// 인덱스의 합을 1>? 동일 변수	-
//		/2를 왜 저렇게쓰냐;
//		중간 인덱스, 인덱스 각각 변수에 복사
		long A=Math.max(o(f,m),o(m+1,t)),n=a[m],s=n,p,q;	// A=앞뒷부분 재귀 큰값 n=중간인덱스 값, 값 복사
//		양사이드 재귀중 큰부분, 중간 인덱스값, 동일값, 이래에 사용될 값
//		System.out.println(f+" "+t+" "+m);					// 나누기였구연
		while(r-l<t-f) {									
//			중간 인덱스 복사했던 값 r,l 길이가 초기 길이보다 작을 동안
			p=l>f?(a[l-1]+s)*Math.min(n,a[l-1]):-1;			
//			p=현재 앞이 초기 앞보다 크면 
			q=r<t?(a[r+1]+s)*Math.min(n,a[r+1]):-1;			//
			if(p>q) {										//
				s+=a[l-1];									//
				n=Math.min(n,a[l---1]);						//
			}else {											//
				s+=a[r+1];									//
				n=Math.min(n, a[r+++1]);					//
			}								
			A=Math.max(A, s*n);								//
		}
		return A;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i++<n;a[i]=Integer.parseInt(t.nextToken()));
		System.out.println(o(1,n));
	}
}
// 시벌 시간도 더 오래걸리는게 왜 더 어렵노