package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//http://blog.naver.com/occidere/220793012348
//이문제같은경우는 점화식 공식을 떠올려야하는 문제?

public class P9084_2 {
	public static void main(String[] args)throws Exception{
		int n,m,a[],p,d[],i,j;
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		for(n=Integer.parseInt(r.readLine());n-->0;) {
			m=Integer.parseInt(r.readLine());
			StringTokenizer t=new StringTokenizer(r.readLine());
			a=new int[m+1];
			for(i=1;i<=m;a[i++]=Integer.parseInt(t.nextToken()));
			p=Integer.parseInt(r.readLine());
			d= new int[p+1];//테스트케이스만큼 돌려야 하므로 매 케이스마다 선언해 초기화함
			d[0] = 1;
			for (i = 1; i <= m; i++)
				for (j = a[i]; j <= p; j++)
					d[j] += d[j - a[i]];
			System.out.println(d[p]);
		}
	}
}