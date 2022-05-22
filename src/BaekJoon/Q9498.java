package Baekjoon;

import java.util.Scanner;

public class Q9498 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=s.nextInt();
        if(a>89) System.out.print("A");
        else if(a>79) System.out.print("B");
        else if(a>69) System.out.print("C");
        else if(a>59) System.out.print("D");
        else System.out.print("F");
	}

}
