package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2 {
	
	static int arr[];
	
	static void swap(int i,int j) {
//		????????????????
		System.out.println("-----\n"+arr[i]+" "+arr[j]);
		arr[i]=(arr[i]+arr[j]);
		System.out.println(arr[i]+" "+arr[j]);
		arr[j]=arr[i]-arr[j];
		System.out.println(arr[i]+" "+arr[j]);
		arr[i]=arr[i]-arr[j];
		System.out.println(arr[i]+" "+arr[j]+"\n-----");
//		int t=arr[i];
//		arr[i]=arr[j];
//		arr[j]=t;
	}
	
	static int partition(int f,int t) {
		int v=arr[t],i=f-1;
		for(int j=f;j<=t-1;j++) if(arr[j]<v) swap(++i,j);
		swap(i+1,t);
		return i+1;
	}
	
	static void qSort(int f,int t) {
		if(f>=t) return;
		int m=partition(f,t);
		qSort(f,m-1);
		qSort(m+1,t);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        arr=new int[N];
        for(int i=0;i<N;i++) arr[i]=Integer.parseInt(br.readLine());
//        System.out.println(Arrays.toString(arr));
        qSort(0,N-1);
//        System.out.println(Arrays.toString(arr));
        for(int i=0;i<N;i++) System.out.println(arr[i]);
	}
}