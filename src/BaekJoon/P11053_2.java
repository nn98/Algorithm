package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11053_2 {

	static int sol(int index,int sum) {
		boolean c=true;
		for(int i=index+1;i<arr.length;i++) {
			if(arr[i]>arr[index]) {
				int r=sol(i,sum);
				r++;
				if(history[index]!=0)
					history[index]=history[index]<r?r:history[index];
				else
					history[index]=r;
				c=false;
			}
		}
		if(c)
			history[index]=++sum;
		return history[index];
	}

	static int[] arr,history;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String[] brr=br.readLine().split(" ");
		arr=new int[n];
		history=new int[n];
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(brr[i]);
		for(int i=0;i<n;i++) sol(i,0);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(history));
		int r=0;
		for(int i=0;i<history.length;i++) if(history[i]>r)r=history[i];
		System.out.println(r);
	}
}