package _Algorithm.String.KMP;
import java.util.Scanner;
public class P1305_2 {
	static int[] k(char[]H,char[]S){
		int h=H.length,s=S.length,f[],r[]=new int[h-s+1],be=0,m=0;
		while(be<=h-s) {
			if(m<s&H[be+m]==S[m])
			m++;
		}
		return r;
	}
	static int[]r(char[]p){
		int[]r=new int[p.length];
		
		return r;
	}
	public static void main(String[]Z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,f[]=new int[n];
		String[]a=s.next().split(""),t=new String[n];
		for(;;) {
			
		}
	}
}