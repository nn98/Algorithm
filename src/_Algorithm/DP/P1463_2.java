package _Algorithm.DP;

// 역순으로 2 -> n 까지 DP

public class P1463_2 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=2,d[]=new int[n+2];
		for(;i<=n;i++) {
			d[i]=d[i-1]+1;
			if(i%2==0)d[i]=Math.min(d[i],d[i/2]+1);
			if(i%3==0)d[i]=Math.min(d[i],d[i/3]+1);
		}
		System.out.println(d[n]);
	}

}
