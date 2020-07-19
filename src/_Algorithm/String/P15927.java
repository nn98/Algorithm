package _Algorithm.String;

// 비회문을 찾으라니까 회문을 찾고있네 병신

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
			}else if(n+1!=m)
				if(a[n-1]==a[n+1]) {
					v=3;
					i=n-1;
					j=n+1;
					while(--i>=0&&++j<m)
						if(a[i]==a[j])v+=2;
						else i=0;
					r=r>v?r:v;
				}
		}
		System.out.println(r);
	}

}
