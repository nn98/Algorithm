package _Algorithm.String;

public class P1254 {

	public static void main(String[] args) {
		char[]a=new char[2000];
		int i,j,l=0,c;
		for(char b:new java.util.Scanner(System.in).next().toCharArray())
			a[l++]=b;
		l--;
		while(true) {
			c=i=0;
			j=l;
			while(i<=j&c==0)
				if(a[i++]!=a[j--])
					c++;
			if(c==0) {
				System.out.print(a);
				return;
			}
		}
	}

}
