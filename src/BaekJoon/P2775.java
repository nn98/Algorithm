package BaekJoon;

import java.util.Scanner;

//13Ка 1ЦЎ

public class P2775 {

	static int count(int k,int n) {
		int sum=0;
		if(k==0) {
			return n;
		} else {
			for(int i=1;i<=n;i++) sum+=count(k-1,i);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			int k=s.nextInt(),n=s.nextInt();
			System.out.println(count(k,n));
		}
	}

}
