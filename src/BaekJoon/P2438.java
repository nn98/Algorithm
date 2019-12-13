package BaekJoon;
public class P2438 {
	public static void main(String[] args) {
		int i=1,j,n=new java.util.Scanner(System.in).nextInt();
		for(;i++<=n;)
			for(j=0;j<i;System.out.print(++j==i?"\n":"*"));
	}
}