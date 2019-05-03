package BaekJoon;

// import java.util.Arrays;
import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[] t=s.next().toUpperCase().toCharArray();
		int[] c=new int[26];
		int max=0;
		boolean d=false;
		for(int i=0;i<t.length;i++) c[t[i]-'A']++;
		// System.out.println(Arrays.toString(c));
		for(int i=1;i<c.length;i++) {
			if(c[i]>c[max]) {
				d=false;
				max=i;
			}
			else if(c[i]==c[max]) d=true; 
		}
		if(d) System.out.println("?");
		else System.out.println((char)('A'+max));
	}

}
