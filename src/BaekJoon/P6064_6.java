package BaekJoon;
import java.util.Scanner;

public class P6064_6 {

	static int B(int a,int b) {
		int c=b%a;
		while(c!=0){
			b=a;
			a=c;
			c=b%a;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int n=s.nextInt();n>0;n--) {
			int a=s.nextInt(),b=s.nextInt(),x=s.nextInt(),y=s.nextInt(),
					g=a*b/B(a,b);
			if(a==x&&b==y) {
				System.out.println(g);
				continue;
			}
			if(b==y)y=0;
			for(;x<=g;x+=a) {
				if(x%b==y)break;
			}
			if(x>g)System.out.println(-1);
			else System.out.println(x);
		}
	}
}