package _Algorithm.String;
public class P1254{
	public static void main(String[] args) {
		char[]a=new char[2000];
		int i,j,l=0,c,s=0,f,r;
		for(char b:new java.util.Scanner(System.in).next().toCharArray())
			a[l++]=b;
		f=s=(r=l)*2;
		l=0;
		while(true) {
//			System.out.println(a);
			c=i=0;
			j=s;
			while(i<=j&c==0) {
				while(a[j]==0)j--;
				if(a[i++]!=a[j--])
					c++;
			}
			if(c==0) {
//				System.out.println(a);
				System.out.println(r);
				return;
			}
			a[f--]=a[l++];
			r++;
		}
	}
}