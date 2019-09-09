package BaekJoon;

import java.util.Scanner;

public class P17294 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] n=s.next().split("");
		boolean b=true;
		if(n.length==1) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
			return;
		}
		else {
			int c=Integer.parseInt(n[0])-Integer.parseInt(n[1]);
			for(int i=1;i<n.length;i++) {
				if(Integer.parseInt(n[i-1])-Integer.parseInt(n[i])!=c) {
					b=false;
					break;
				}
			}
		}
		if(b) System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
		else System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
	}

}
