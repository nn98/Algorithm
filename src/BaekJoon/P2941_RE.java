package BaekJoon;

import java.util.Scanner;

public class P2941_RE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String t=s.nextLine();
		String[] c= {"dz=","c=","c-","d-","lj","nj","s=","z="};
		for(int i=0;i<c.length;i++) t=t.replaceAll(c[i], "!");
		System.out.println(t.length());
	}
}
