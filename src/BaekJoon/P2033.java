package BaekJoon;

public class P2033 {
	//문제를 제대로 읽자
	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=10,j,m;
//		if(n<10&&n>4)
//			n=10;
		for(;i<n;i*=10) {
			m=n%i;
			j=m/(i/10);
			if(j>4)
				n+=i;
			n-=m;
			System.out.println(n+" "+i);
		}
		System.out.print(n);
	}
}