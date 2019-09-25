package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1012_2 {

	static boolean[][] arr;
	static int sum=0;

	static void sol(int i,int j,boolean c) {
		System.out.println(i+" "+j);
		if(c) {
//			System.out.println("c 1: "+i+" "+j);
			sum++;
			c=false;
			arr[i][j]=false;
		}
		else {
//			System.out.println("c 2: "+i+" "+j);
			arr[i][j]=false;
		}
		if(i>1) {
			if(arr[i-1][j])
				sol(i-1,j,c);
		}
		if(j>1) {
			if(arr[i][j-1])
				sol(i,j-1,c);
		}
		if(i<arr.length-1) {
			if(arr[i+1][j])
				sol(i+1,j,c);
		}
		if(j<arr[i].length-1) {
			if(arr[i][j+1])
				sol(i,j+1,c);
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int o=Integer.parseInt(br.readLine());
		for(int i=0;i<o;i++) {
			sum=0;
			String in[]=br.readLine().split(" ");
			arr=new boolean[Integer.parseInt(in[0])][Integer.parseInt(in[1])];
			int f=Integer.parseInt(in[2]);
			for(int j=0;j<f;j++) {
				in=br.readLine().split(" ");
				arr[Integer.parseInt(in[0])][Integer.parseInt(in[1])]=true;
			}
			for(int j=0;j<arr.length;j++) 
				System.out.println(Arrays.toString(arr[j]));
			for(int j=0;j<arr.length;j++) 
				for(int k=0;k<arr[j].length;k++) 
					if(arr[j][k]) sol(j,k,true);
			for(int j=0;j<arr.length;j++) 
				System.out.println(Arrays.toString(arr[j]));
			bw.write(""+sum);
			if(i<o-1) bw.newLine();
		}
		bw.flush();
	}
}
