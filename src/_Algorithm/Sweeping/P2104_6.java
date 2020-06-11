package _Algorithm.Sweeping;
// Sweeping OK Thank u https://beginthread.tistory.com/25
import java.util.*;
public class P2104_6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,a[],b[],m,i=0,j=0;
		long u[],v,w=0;
		a=new int[n+1];
		b=new int[n];
		u=new long[n];
		for(;++i<n;u[i]=u[i-1]+(a[i]=s.nextInt()));
		a[n]=0;
		for(i=0;++i<=n;) {
			while(a[b[j]]>=a[i]) {
				m=a[b[j--]];
				if(j<0)break;
				v=m*(u[i-1]-u[b[j]]);
				w=w>v?w:v;
			}
			b[++j]=i;
		}
		System.out.print(w);
	}
}
// 처음엔 구간별 합을 싹 구해서 2차원배열 1차원배열 리스트 배열 개지랄 + 구간 내에서 최소값 찾아서 값 계산
// 여튼 전처리에 메모리가 너무 많이들어 Memory over

// 스위핑과 분할 정복으로 해결 가능, 스위핑은 ㅇㅋ