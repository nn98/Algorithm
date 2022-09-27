package _Algorithm.Simple_Implementation;

public class P17618 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=0,j,k,r=0;
		for(;i++<n;) {
			j=0;
			for(k=1;j/k>0;j+=i/k,k*=10);
			if(i%j<1)r++;
		}
		System.out.println(r);
	}

}
