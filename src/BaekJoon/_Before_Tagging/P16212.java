package BaekJoon._Before_Tagging;

import java.util.Scanner;
//multiple value
public class P16212 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt(),j=4000001,p=2000000;
		boolean[]a=new boolean[j];
		for(;i-->0;a[s.nextInt()+p]=true);
		for(i=-1;++i<j;System.out.print(a[i]?i-p+" ":""));
	}
}