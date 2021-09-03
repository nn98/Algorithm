package _Algorithm.Two_Pointer;

public class P2018 {

	public static void main(String[]z) {
		int n=new java.util.Scanner(System.in).nextInt(),i=1,j=2,r=0,v=1;
		for(;j<=n;) {
			if(v==n)r++;
//			r=v==n?r+1:r;
			if(v<n)v+=++j;
			else v-=i++;
		}
		System.out.println(r);
	}
}
