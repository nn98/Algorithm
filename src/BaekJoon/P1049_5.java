package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1049_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a,b,r=0,k[][]=new int[2][m];
		a=b=Integer.MAX_VALUE;
		for(int i=0;i<m;i++) {
			k[0][i]=s.nextInt();
			k[1][i]=s.nextInt();
		}
		Arrays.sort(k[0]);
		Arrays.sort(k[1]);
		a=k[0][0];
		b=k[1][0];
//		if(a==0||b==0) {
//			System.out.print(0);
//			return;
//		}
		
		//이 방법이 틀림
		//공식도 하나 못쓰는 빡대가리 ㄹㅇ
//		if(a<b*6) {
//			r+=n/a;
//			r+=a<n%6*b?a:n%6*b;
//		} else {
//			r+=b*n;
//		}
//		System.out.print(r);

		int Min;
		Min = Math.min(((n/6)+1)*k[0][0], n*k[1][0]);    
        Min = Math.min(Min, ((n/6))*k[0][0] + (n%6)*k[1][0]);
        System.out.print(Min);
        
		r=Math.min(((n/6)+1)*a,n*b);
		r=Math.min(r, ((n/6))*a+(n%6)*b);
	}
}