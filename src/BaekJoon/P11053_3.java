package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P11053_3 {

	static int sol(int index) {
		if(index>=arr.length-1) history[index]=1;
		else {
			for(int i=index;i<arr.length;i++) {
				if(arr[i]>arr[index]) {
					if(history[i]!=0) {
						if(history[index]==0) history[index]=history[i]+1;
						else history[index]=history[index]>history[i]+1?history[index]:history[i]+1;
					}
					else {
						if(history[index]==0) history[index]=sol(i);
						else history[index]=history[index]>sol(i)?history[index]:sol(i);
					}
				}
			}
		}
//		System.out.println("sol "+index+" return "+(history[index]+1));
		if(history[index]>r) r=history[index];
		return history[index]+1;
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
				sol(i);
			}
		}
//		System.out.println(Arrays.toString(history));
		System.out.println(r);
	}
}
