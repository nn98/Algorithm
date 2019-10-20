package BaekJoon;

import java.util.Scanner;

public class P11653_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=2,j;
		boolean[]h=new boolean[n+1];
		for(;i<=n;i++)
			if(!h[i])
				for(j=i+i;j<=n;j+=i)
					h[j]=true;
		while(n!=1) {
			for(i=2;i<=n;i++) {
				if(!h[i]) {
					if(n%i==0) {
						System.out.println(i);
						n/=i;
						break;
					}
				}
			}
		}
	}

}
