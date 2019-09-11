package BaekJoon;

import java.util.Scanner;

public class P1292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean o=false;
		int f=s.nextInt(),t=s.nextInt(),index=0,sum=0;
		for(int i=1;;i++) {
			for(int j=i;j>0;j--) {
				index++;
				if(index>t) {
					o=true;
					break;
				}
				if(index>=f) sum+=i;
			}
			if(o) break;
		}
		System.out.println(sum);
	}
}