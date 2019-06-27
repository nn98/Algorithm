package BaekJoon;

import java.util.Scanner;

public class P5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int V=1000-s.nextInt();
		int a=V/500,b=(V%500)/100,c=(V%100)/50,d=(V%50)/10,e=(V%10)/5,f=V%5;
		System.out.println(a+b+c+d+e+f);
	}

}