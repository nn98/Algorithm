package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class P11651 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		String[] arr=new String[200001];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		ArrayList<Integer>[] arr=new ArrayList[200001];
		for(int i=0;i<n;i++) {
			String[] in=br.readLine().split(" ");
			int a=Integer.parseInt(in[1])+100000;
			if(arr[a]==null) {
				arr[a]=new ArrayList();
				arr[a].add(Integer.parseInt(in[0]));
			}
			else arr[a].add(Integer.parseInt(in[0]));
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				Collections.sort(arr[i]);
				for(int j:arr[i]) bw.write(""+j+" "+(i-100000)+"\n");
			}
		}
		bw.flush();
	}
}