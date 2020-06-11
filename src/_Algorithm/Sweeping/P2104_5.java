package _Algorithm.Sweeping;
// 스택 대신 배열?
import java.io.*;
import java.util.*;
public class P2104_5 {
	static int n,m,i,k,a[],s[];
	static long R,w,e,h,u[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine())+1;	// 걍 n에 1 더애허 해도 ㅇㅋ
		a=new int[n+1];
		u=new long[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;++i<n;) {
			a[i]=Integer.parseInt(t.nextToken());
			u[i]=u[i-1]+a[i];				// 입력받으면서 합 배열에 합 저장
		}
		a[n]=0;								// 값 배열 마지막 칸(n+1)에 0
		s=new int[n];						// 스택 대용 인덱스 배열?
		for(i=1;i<=n;i++) {					// 1부터 마지막 칸(n+1)까지
			System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(u)+"\n"+Arrays.toString(s)+"\n"+w);
			while(a[s[m]]>=a[i]) {			// 현재 [인덱스 배열 [인덱스]]의 값이 현재 [i]값보다 크거나 같을 동안
				int h=a[s[m--]];			// h=현재 [인덱스 배열 [인덱스]]의 값
				if(m<0)break;				// 인덱스가 음수면 아웃
				long v=h*(u[i-1]-u[s[m]]);	// 결과값은 h(현재 [인덱스 배열 [인덱스]]의 값)*
				System.out.printf("\t%d * ( %d - %d ) = %d\n",h,u[i-1],u[s[m]],v);
				// 역시 지능이 모자랄 땐 가시적인 설명이 필요하다
				// 자기보다 큰 값만 넣었다 == 제일 뒤의 값이 최소값이다 //
				// 그렇기에 작은 값을 만났을 때 스택에서 팝 == 높이
				// 합 배열에서 스택에 남은 다음 수 까지의 합을 현재 합에서 빼면 == 넓이
				// 마지막 값에 0을 넣은 이유는 무조건 이 반복을 싱행해서 남은 수를 다 빼내기 위해. 캬 시발
				// 나는 돌대가리다 나는 돌대가리다
				if(w<v)w=v;
			}
			s[++m]=i;
		}
		System.out.println(w);
	}
}