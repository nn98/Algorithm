package _Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P9177 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),i=0,j,x,y,z;
		for(;i++<n;) {
			//			StringTokenizer t=new StringTokenizer(r.readLine());
			x=y=z=j=0;
			char a[][]=new char[3][],t;
			for(String b:r.readLine().split(" "))a[j++]=b.toCharArray();
			boolean c=true;
			j=0;
			while(c&&j<a[2].length) {
				t=a[2][j++];
				if(x==a[0].length)
					if(t==a[1][y])y++;
					else c=!c;
				else if(y==a[1].length)
					if(t==a[0][x])x++;
					else c=!c;
				else 
					if(t==a[0][x])x++;
					else if(t==a[1][y])y++;
					else c=!c;
			}
			w.write("Data set "+i+(c?": yes":": no"));
		}
		w.flush();
	}

}
