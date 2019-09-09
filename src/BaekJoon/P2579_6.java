package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class P2579_6 {

	static int arr[],history[],max=0;

	static void sol(int index,boolean count,int sum) {
//		if(index>=arr.length) return;
		history[index]=sum+arr[index];
		max=max>history[index]?max:history[index];
		if(count) {
			if(!(index+2>=arr.length)) 
				if(history[index+2]<history[index]+arr[index+2])
					sol(index+2,false,history[index]);

		}
		else {
			if(!(index+1==arr.length)) 
				if(history[index+1]<history[index]+arr[index+1])
					sol(index+1,true,history[index]);

			if(!(index+2>=arr.length))
				if(history[index+2]<history[index]+arr[index+2])
					sol(index+2,false,history[index]);

		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr=new int[n];
		history=new int[n];
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) sol(i,false,0);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(history));
		System.out.println(max);
	}
}