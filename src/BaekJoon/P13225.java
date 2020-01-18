package BaekJoon;

import java.util.Scanner;

public class P13225 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),v,c,j;
		for(;n-->0;) {
			v=s.nextInt();
			c=0;
			boolean[]a=new boolean[v+1];
			for(j=1;j<=v/2;j++){
				if(v%j==0) {
					if(a[j])continue;
					a[j]=true;
					a[v/j]=true;
					c+=2;
					if(j*j==v)c--;
				}
			}
			System.out.println(v+" "+(v==1?v:c));
		}

	}

}
