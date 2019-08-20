package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P2309 {

	static int n,arr[],his[],count=0;
	static boolean c=false;
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

	//	static void sol(int index,int sum,int count) {
	//		if(index==n) {
	//			if(sum==100) System.out.println(Arrays.toString(his));
	//			return;
	//		}
	//		sol(index+1,sum,count);
	//		his[count]=arr[index];
	//		sol(index+1,sum+arr[index],count++);
	//	}

	static boolean sol(int index,int sum,String history) throws IOException {
		if(c) return true;
		if(index==n) {
			if(sum==100) {
				String[] brr=history.split("\n");
				if(brr.length==7) {
					int[] crr=new int[7];
					for(int i=0;i<7;i++) crr[i]=Integer.parseInt(brr[i]);
					Arrays.sort(crr);
					for(int i:crr) System.out.println(i);
					c=true;
				}
				return true;
			}
			return false;
		}
		boolean a,b;
		a=sol(index+1,sum,history);
		b=sol(index+1,sum+arr[index],history+=arr[index]+"\n");
		return a||b;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		n=9;
		arr=new int[n];
		his=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		sol(0,0,"");
		bw.flush();
	}

}
