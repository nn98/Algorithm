package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test02 {

	static int n,m,i=1,j,k,x,y,v,a[],t[];
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static void p() {
		if(x>=j)y=x-j+1;
		else {
			y=t[x*=2];
		}
	}
	public static void main(String[]z)throws Exception{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter W=new BufferedWriter(new OutputStreamWriter(System.out));

	}

}
