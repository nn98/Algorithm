package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1212 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String k=br.readLine();
		int in=Integer.parseInt(k);
		if(in==0) {
			System.out.println(in);
			return;
		}
		String[] arr=k.split("");
		String r="";
		for(String i:arr) {
			int n=Integer.parseInt(i),brr[]=new int[3];
			brr[0]=n/4;
			brr[1]=n%4/2;
			brr[2]=n%2/1;
			for(int j=0;j<brr.length;j++) {
				if(r.length()==0) 
					if(brr[j]==0)
						continue;
				r+=brr[j];
			}
		}
		System.out.println(r);
	}
}