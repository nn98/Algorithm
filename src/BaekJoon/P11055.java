package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P11055 {
	//½Ã¹ú ¼­¼ø
	static void sol(int index,int v) {
		history[index]=v+arr[index];
		for(int i=index+1;i<arr.length;i++) {
			if(arr[i]>arr[index]) {
				if(history[i]<history[index]+arr[index]) sol(i,history[index]);
			}
		}
	}
	
	static int r=1,arr[],history[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String[] brr=br.readLine().split(" ");
		arr=new int[n];
		history=new int[n];
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(brr[i]);
		for(int i=0;i<n;i++) {
			if(history[i]==0) {
//				System.out.println("Call sol"+i);
				sol(i,0);
			}
		}
		for(int i:history) r=r>i?r:i;
		System.out.println(Arrays.toString(history));
		System.out.println(r);
	}
}