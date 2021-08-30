package _Algorithm.DP;

public class P1463 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),m=n,i=0;
		while(m!=1) {
			if(m%3==0)m/=3;
			else if(m%2==0)m/=2;
			else m--;
			i++;
		}
		System.out.println(i);
	}

}
