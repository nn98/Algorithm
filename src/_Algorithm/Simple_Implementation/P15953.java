package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P15953 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,p,j;
		for(;i++<n;) {
			j=0;
			p=s.nextInt();
			j+=p<1?0:p<2?500:p<4?300:p<7?200:p<11?50:p<16?30:p<22?10:0;
			p=s.nextInt();
			j+=p<1?0:p<2?512:p<4?256:p<8?128:p<16?64:p<32?32:0;
			System.out.println(j*10000);
		}
	}

}
