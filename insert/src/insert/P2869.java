package insert;

import java.util.Scanner;

public class P2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),v=s.nextInt(),sum=0,day=0;
		if(v%(a-b)==0) System.out.println(v/(a-b)-1);
		else System.out.println(v/(a-b));
//		while(true) {
//			day++;
//			sum+=a;
//			if(sum>=v) {
//				System.out.print(day);
//				break;
//			}
//			sum-=b;
//		}
	}

}
	