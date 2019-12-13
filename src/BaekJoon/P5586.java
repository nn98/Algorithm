package BaekJoon;

public class P5586 {

	public static void main(String[] args) {
		char[]a=new java.util.Scanner(System.in).next().toCharArray();
		int J=0,I=0,i=0;
		for(;i<a.length-2;i++) {
			if(a[i+1]=='O'&&a[i+2]=='I') {
				if(a[i]=='I')I++;
				if(a[i]=='J')J++;
			}
		}
		System.out.print(J+"\n"+I);
	}
}
