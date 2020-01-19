package BaekJoon;

import java.util.*;
public class P5554{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=0,i=0;
		for(;i++<4;r+=s.nextInt());
		System.out.print(r/60+"\n"+r%60);
	}
}