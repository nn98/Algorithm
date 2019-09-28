package BaekJoon;

import java.util.Scanner;

class P1644_S{
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		boolean[]c=new boolean[4000001];
		for(int i=2;i<c.length;i++)if(!c[i])for(int j=i*2;j<c.length;j+=i)c[j]=true;
		int n=s.nextInt(),u=0,r=0,f=2;
		for(int i=2;i<=n;i++){
			if(c[i]) continue;
			if(!c[i]) u+=i;
			while(u>n){
				u-=f++;
				while(c[f])f++;
			}
			if(u==n)r++;
		}
		System.out.print(r);
	}
}