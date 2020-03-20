package BaekJoon;

import java.util.*;
public class P3034 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),k=s.nextInt(),p=(int)Math.sqrt(m*m+k*k);
		for(;n-->0;System.out.println(s.nextInt()<=p?"DA":"NE"));
	}
}