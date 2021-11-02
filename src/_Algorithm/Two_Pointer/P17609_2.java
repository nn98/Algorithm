package _Algorithm.Two_Pointer;
import java.util.Scanner;
public class P17609_2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,x,y,c;
		for(;n-->0;) {
			x=y=c=0;
			String u=null;
			StringBuffer a=new StringBuffer(s.next()),b;
			i=a.length()/2;
			if(a.length()%2==1) {
				u=a.substring(i,i+1);
				b=new StringBuffer(a.subSequence(i+1,i*2+1));
				System.out.println(u);
			}else b=new StringBuffer(a.subSequence(i,i*2));
			a=new StringBuffer(a.subSequence(0,i));
			b=b.reverse();
			System.out.println(a);
			System.out.println(b);
			for(;x<i|y<i;x++,y++) {
				if(a.charAt(x)!=b.charAt(y)) {
					if(a.charAt(x+1)==b.charAt(y)) {
						if(u!=null)a.append(u);
						x++;
					}
					else if(a.charAt(x)==b.charAt(y+1)) {
						if(u!=null)b.append(u);
						y++;
					}
					else c=1;
					c++;
				}
				if(c>1) {
					break;
				}
			}
			System.out.print(c);
		}
	}
}