package BaekJoon;

import java.util.Scanner;

public class P2566 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int max=0,index=0,jndex=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				int a=s.nextInt();
				if(a>max) {
					max=a;
					index=i+1;
					jndex=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(index+" "+jndex);
	}

}