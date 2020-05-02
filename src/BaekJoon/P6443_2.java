package BaekJoon;

import java.util.Scanner;

public class P6443_2 {
	static int n,m,k;
	static char[]p=new char[26],f=new char[1001],a;

	static void D(int x,int d){
		if(d==m) {
			System.out.println(String.valueOf(f));
			return;
		}
		for(int i=0;i<26;i++)
			if(0<p[i]) {
				p[i]--;
				f[d]=(char)('a'+i);
				D(i,d+1);
				p[i]++;
			}
	}

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;k<n;k++) {
			a=s.next().toCharArray();
			m=a.length;
			for(char j:a)p[j-'a']++;
			D(0,0);
			for(int G=0;G<26;G++)p[G]=0;
		}
	}

}