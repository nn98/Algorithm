package _Algorithm.Simple_Implementation;

public class P14920 {

	public static void main(String[] args) {
		for(int n=new java.util.Scanner(System.in).nextInt(),i=0;n>1;++i,n=n%2<1?n/2:n*3+1,System.out.print(n>1?"":i));
	}

}
