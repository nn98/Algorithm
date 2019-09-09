package BaekJoon;

import java.util.Scanner;

public class P8741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long n=(long) Math.pow(2, s.nextInt())-1,cast=1+n,
				sum=(n/2+1)+cast*(n/2),count=1;
//		System.out.println(sum);
		while(count<=sum) {
			count*=2;
		}
		count/=2;
		String r="";
		while(count!=0) {
//			System.out.println(count);
//			System.out.print(sum/count);
			r+=sum/count;
			sum%=count;
			count/=2;
		}
		System.out.println(r);
	}

}
