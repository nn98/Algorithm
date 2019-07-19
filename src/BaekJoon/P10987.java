package BaekJoon;

import java.util.Scanner;

public class P10987 {
	//2min
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r=0;
		String[] arr=s.nextLine().split("");
		for(String i:arr) {
			if(i.equals("a")||i.equals("e")||i.equals("i")||i.equals("u")||i.equals("o")) r++;
		}
		System.out.println(r);
	}

}
