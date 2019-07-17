package BaekJoon;

import java.util.Scanner;

public class P2554 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t,i=1,sum=1,tar=10;
//		while(true) {
//			sum=1;
//			i=1;
			t=s.nextInt();
			while(i<=t) {
				sum=sum*i;
				while(sum%10==0) sum/=10;
				sum%=tar;
				//				System.out.println(i+"! : "+sum);
				i++;
				if(i>=tar) tar*=10;
			}
			sum%=10;
			System.out.println(sum);
//		}
	}
}