package _Algorithm.String;

public class P15927 {

	public static void main(String[] args) {
		char[]a=new java.util.Scanner(System.in).next().toCharArray();
		int r=-1,i=0,j,v,n=a.length,m=n;
		while(n-->1) {
			if(a[n-1]==a[n]) {
				v=2;
				i=n-1;
				j=n;
				while(--i>=0&&++j<m)
					if(a[i]==a[j])v+=2;
					else i=0;
				r=r>v?r:v;
			}
		}
		System.out.println(r);
	}

}
