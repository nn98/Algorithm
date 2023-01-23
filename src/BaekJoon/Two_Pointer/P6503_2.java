package BaekJoon.Two_Pointer;

import java.io.*;

public class P6503_2 {

	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n,i,j,c,a[],r;
		char t[],b,d;
//		for(char t=0;t<129;System.out.println(t+" "+(int)t++));
		while((n=Integer.parseInt(br.readLine()))>0) {
			r=c=i=j=0;
			a=new int[129];
			t=br.readLine().toCharArray();
			for(;j<t.length;j++){
				b=t[j];
				if(a[b]==0)c++;
				a[b]++;
				if(c>n) {
					for(;c>n;i++) {
						d=t[i];
						a[d]--;
						if(a[d]==0)c--;
					}
				}
				r=r>j-i+1?r:j-i+1;
			}
			bw.write(r+"\n");
		}
		bw.flush();
	}

}