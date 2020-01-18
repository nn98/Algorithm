package BaekJoon;

public class P8320_S {
	public static void main(String[] zzzz){
		int N=new java.util.Scanner(System.in).nextInt(),c=0,i=1,j;
		for(;i<=N;i++) 
			for(j=i;j*i<=N;j++) 
				c++;
		System.out.print(c);
	}
}