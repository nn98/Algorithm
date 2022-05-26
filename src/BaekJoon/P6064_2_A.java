package BaekJoon;
import java.util.Scanner;

public class P6064_2_A {

	static int GCD(int a,int b) {
		while(b!=0) {
			int t=a%b;
			a=b;
			b=t;
		}
		return a;
	}
	static int LCM(int a,int b) {
		return a/GCD(a,b)*b/GCD(a,b)*GCD(a,b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),r=-1;
			if(a<b) {
				int q=b-a;
				if((d-c)%q!=0) System.out.println(r);
				else {
					
				}
			}
			else {
				
			}
		}
	}

}
