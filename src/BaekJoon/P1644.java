package BaekJoon;

import java.util.Scanner;

public class P1644 {
	//시간초과 안나네? 원트개꿀
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean[]c=new boolean[4000001];
		for(int i=2;i<c.length;i++)if(!c[i])for(int j=i*2;j<c.length;j+=i)c[j]=true;
		int n=s.nextInt(),u=0,r=0,f=2;
		for(int i=2;i<=n;i++) {
			if(c[i]) continue;
			if(!c[i]) u+=i;
			while(u>n) {
				u-=f++;
				while(c[f])f++;
			}
			if(u==n)r++;
		}
		System.out.print(r);
	}

}
