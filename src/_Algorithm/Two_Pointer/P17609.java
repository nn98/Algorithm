package _Algorithm.Two_Pointer;
// static 쓴다고 깝치지 말자
import java.util.Scanner;
public class P17609 {
	static int n,r,i;
	static StringBuffer f,t;
	static int o(int X) {
		int i=0,a,b,x=0,y=f.length()-1;
		for(;x<y&i<1;) {
			if(!(f.charAt(x)==f.charAt(y)))i++;
			else {
				x++;
				y--;
			}
		}
		if(i>0) {
			if(++X>1)return X;
			t=new StringBuffer(f);
			f.deleteCharAt(x);
			a=o(X);
			f=new StringBuffer(t.deleteCharAt(y));
			b=o(X);
			return a<b?a:b;
		}
		return X;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;i++<n;) {
			f=new StringBuffer(s.next());
			System.out.println(o(0));
		}
	}
}