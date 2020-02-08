package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P7806 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
			int n=s.nextInt(),m=s.nextInt(),i=0;
			boolean[]k=new boolean[1000000001];
			for(;++i<=Math.sqrt(m);k[i]=k[m/i]=m%i==0);
			System.out.println(Arrays.toString(k));
		}
	}
}