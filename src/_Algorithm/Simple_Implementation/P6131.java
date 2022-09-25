package _Algorithm.Simple_Implementation;

public class P6131 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=1,j=1,I,J,r=0;
		for(;i<=500|j<=500;) {
//			System.out.println(i+" "+j);
			I=i*i;
			J=j*j;
			if(J-I==n)r++;
			if(J-I<n)j++;
			else i++;
		}
		System.out.println(r);
	}

}
