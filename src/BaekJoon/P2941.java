package BaekJoon;

import java.util.Scanner;

public class P2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String t=s.nextLine();
		String[] c= {"c=","c-","d-","lj","nj","s=","z="};
		for(int i=0;i<t.length()-1;i++) {
			for(int j=0;j<c.length;j++) {
				if(i==t.length()-2) break;
				//System.out.println(t.substring(i,i+3));
				if(t.substring(i, i+3).compareTo("dz=")==0) {
					//System.out.println("case 2");
					String r=t.substring(0,i)+"!"+t.substring(i+3,t.length());
					t=r;
				}
			}
			for(int j=0;j<c.length;j++) {
				if(i==t.length()-1) break;
				//System.out.println(t.substring(i,i+2));
				if(t.substring(i, i+2).compareTo(c[j])==0) {
					//System.out.println("case 1");
					String r=t.substring(0,i)+"!"+t.substring(i+2,t.length());
					t=r;
				}
			}
		}
		System.out.println(t.length());
	}

}
