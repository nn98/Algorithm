package Algorithm_Training;

import java.util.Scanner;

public class L_4_4 {
	
	static int n;
	public static void sol(int x,int y) {
		String r="";
		//String s1="",s2="";
		for(int i=n-1;i>=0;i--) {
			//s1+=x>>i&1;
			//s2+=y>>i&1;
			if ((x>>i&1)==1 || (y>>i&1)==1) r+="#";
			else r+=" ";
		}
		//System.out.println(s1+"\n"+s2+r);
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] x=new int[n],y=new int[n];
		for(int i=0;i<n;i++) x[i]=s.nextInt();
		for(int i=0;i<n;i++) y[i]=s.nextInt();
		for(int i=0;i<n;i++) sol(x[i],y[i]);
	}

}
