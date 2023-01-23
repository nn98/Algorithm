package BaekJoon.BackTracking;
import java.util.*;

public class P1759 {
	static int n,m,i,c[],d[]=new int[2];
	static char[]a,b;
	static List<Character>l=new ArrayList();
	static void o(int x,int i) {
		if(x<n) {
			for(;i<m;i++)
				if(c[i]<1) {
					c[i]++;
					if(l.contains(a[i]))d[0]++;
					else d[1]++;
					b[x]=a[i];
					o(x+1,i+1);
					c[i]--;
					if(l.contains(a[i]))d[0]--;
					else d[1]--;
				}
		}else if(d[0]>0&d[1]>1)System.out.println(b);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		c=new int[m];
		b=new char[n];
		a=new char[m];
		for(;i<m;a[i++]=s.next().charAt(0));
		l.add('a');
		l.add('e');
		l.add('i');
		l.add('o');
		l.add('u');
		Arrays.sort(a);
		o(0,0);
	}
}