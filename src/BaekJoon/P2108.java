package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2108 {
	
	static void swap(int[] arr,int i,int j) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	
	static int p(int arr[],int f,int t) {
		swap(arr,(f+t)/2,t);
		int v=arr[t],i=f-1;
		for(int j=f;j<=t-1;j++) if(arr[j]<v) swap(arr,++i,j);
		swap(arr,i+1,t);
		return i+1;
	}
	
	static void qSort(int[] arr,int f,int t) {
		if(f>=t) return;
		int m=p(arr,f,t);
		qSort(arr,f,m-1);
		qSort(arr,m+1,t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),sum=0;
		int[] arr=new int[N];
		for(int i=0;i<N;i++) sum+=arr[i]=s.nextInt();
		qSort(arr,0,arr.length-1);
		//for(int i=0;i<N;i++) System.out.println(arr[i]);
		
		int[][] usual=new int[N][2];
		int j=0,c=arr[0];
		usual[0][0]=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==c) {
				usual[j][1]++;
			}
			else {
				usual[++j][0]=arr[i];
				usual[j][1]++;
				c=arr[i];
			}
		}
		//System.out.println(Arrays.toString(usual[0]));
		//System.out.println(Arrays.toString(usual[1]));
		//System.out.println(Arrays.toString(usual[2]));
		//System.out.println(Arrays.toString(usual[3]));
		//System.out.println(Arrays.toString(usual[4]));
		int max=usual[0][1],mmax=usual[0][0];
		int[] maxx=new int[N];
		boolean dup=false;
		for(int i=0;i<usual.length;i++) {
			if(max<=usual[i][1]) {
				//System.out.println(max+"max change"+usual[i][1]);
				max=usual[i][1];
				mmax=usual[i][0];
				//maxx[0]=usual[i][1];
			}
		}
		j=0;
		for(int i=0;i<usual.length;i++) {
			if(max==usual[i][1]) {
				maxx[j++]=usual[i][0];
			}
		}
		int r=j>1?maxx[1]:maxx[0];
		//System.out.println(Arrays.toString(maxx));
		//System.out.println(mmax+" , "+max);
		System.out.println(Math.round((double)sum/N));
		System.out.println(arr[(0+arr.length-1)/2]);
		System.out.println(r);
		System.out.println(arr[arr.length-1]-arr[0]);
	}

}
