package BaekJoon;

//caution description
import java.util.Scanner;
public class P3029 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]a=s.next().split(":"),b=s.next().split(":");
		int t[]=new int[3],i=3,f=0,A,B;
		for(;--i>=0;) {
			A=Integer.parseInt(a[i]);
			B=Integer.parseInt(b[i]);
			if(f==1) {
				f=0;
				B--;
			}
			t[i]=B-A;
			if(t[i]<0) {
				if(i==0)t[i]+=24;
				else t[i]+=60;
				f=1;
			}
		}
		if(t[0]==0&&t[1]==0&&t[2]==0)t[0]=24;
		for(;++i<3;System.out.printf("%02d"+(i==2?"":":"),t[i]));
	}
}