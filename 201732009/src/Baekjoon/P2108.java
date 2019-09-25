package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()),max=Integer.MIN_VALUE,mIndex1=Integer.MIN_VALUE,mIndex2=Integer.MIN_VALUE,
				arr[]=new int[8002],test=n/2+1,mid=0,f=0,t=arr.length-1;
		double sum=0;
		for(int i=0;i<n;i++) {
			int in=Integer.parseInt(br.readLine());
			sum+=in;
			arr[in+4000]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				if(test>0) {
					test-=arr[i];
					if(test<=0) mid=i;
				}
				if(max<arr[i]) {
					max=arr[i];
					mIndex1=i;
					mIndex2=Integer.MIN_VALUE;
				}
				else if(max==arr[i]) {
					if(mIndex2==Integer.MIN_VALUE) mIndex2=i;
				}
			}
		}
		bw.write(""+Math.round(sum/n)+"\n");
		bw.write(""+(mid-4000)+"\n");
		if(mIndex2!=Integer.MIN_VALUE)
		bw.write(""+(mIndex2-4000)+"\n");
		else
			bw.write(""+(mIndex1-4000)+"\n");
		for(int i=f;arr[i]==0;i++) f++;
		for(int i=t;arr[i]==0;i--) t--;
//		System.out.println(f+" "+t);
		bw.write(""+(t-f));
//		bw.write(""+Math.round(sum/n)+"\n");
		bw.flush();
	}
}