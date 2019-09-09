package BaekJoon;

import java.util.Scanner;
//Fucking Math
public class P7894 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		for(int i=0;i<m;i++) {
			int n=s.nextInt(),a=2,c=1;
			for(int j=3;j<=n;j++) {
				int b=1;
				while(j/10==0) {
					j/=10;
					b++;
				}
				while(a/10==0) {
					a/=10;
				}
				a*=j;
				if(a>=10) c+=b;
				
			}
		}
	}

}
