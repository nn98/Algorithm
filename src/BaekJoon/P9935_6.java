package BaekJoon;

import java.util.Scanner;

public class P9935_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String input=s.nextLine(),bomb=s.nextLine(),r="";
		if(bomb.length()==1) {
			r=(input.replaceAll(bomb, ""));
			if(r.equals("")) System.out.println("FRULA");
			else System.out.println(r);
			return;
		}
		char target=bomb.charAt(bomb.length()-1),arr[]=new char[input.length()];
		int count=0;
		for(int i=0;i<input.length();i++) {
			arr[i]=input.charAt(i);
			if(input.charAt(i)==target) count++;
		}
	}

}
