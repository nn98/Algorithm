package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2579_5 {

	static int arr[],history[],max=0;

	static int sol(int index,boolean count) {
		if(index>=arr.length) return 0;
		int a=0,b=0;
		if(count) {
			if(index+2>=arr.length) b=0;
			else {
				if(history[index+2]==0)
					a=sol(index+2,false);
				else 
					a=history[index+2];
			}
		}
		else {
			if(index+1==arr.length) a=0;
			else {
				if(history[index+1]==0)
					a=sol(index+1,true);
				else 
					a=history[index+1];
			}
			if(index+2>=arr.length) b=0;
			else {
				if(history[index+2]==0)
					b=sol(index+2,false);
				else 
					a=history[index+2];
			}
		}
		history[index]=(a>b?a:b)+arr[index];
		max=max>history[index]?max:history[index];
		return history[index];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr=new int[n];
		history=new int[n];
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) sol(i,false);
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(history));
		System.out.println(max);
	}
}
/*
6
10
20
15
25
10
20
 */

