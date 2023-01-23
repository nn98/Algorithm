package BaekJoon.String.KMP;

public class P1701_2 {

	public static void main(String[] args) {
		char[]a=new java.util.Scanner(System.in).next().toCharArray();
		int i=0,j,n,r=0,k,l=a.length,h[]=new int[l];
		for(;i<l;i++) {
			j=i;
//			System.out.println(j+" "+n);
			h=new int[l];
			for(k=i+1;k<l;k++) {
				while(j>0&a[i]!=a[j])j=h[j-1];
				if(a[i]==a[j])r=r>++j?r:j;
			}
		}
		System.out.println(r);
	}

}
