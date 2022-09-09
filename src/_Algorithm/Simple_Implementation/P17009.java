package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P17009 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()*3+s.nextInt()*2+s.nextInt(),m=s.nextInt()*3+s.nextInt()*2+s.nextInt();
		System.out.println(n<m?"B":(n==m?"T":"A"));
	}

}
