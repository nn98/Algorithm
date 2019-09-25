package BaekJoon;

//import java.util.Arrays;
import java.util.Scanner;

public class P1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int r=0,f;
		for(int i=0;i<N;i++) {
			f=1;
			String[] t=s.next().split("");
			for(int j=0;j<t.length;j++) {
				int b=j;
				for(int k=j+1;k<t.length;k++) {
					if(t[j].compareTo(t[k])==0) {
						if(k-b==1) b=k;
						else f=0;
					}
				}
			}
			r+=f;
		}
		System.out.println(r);
	}

}
