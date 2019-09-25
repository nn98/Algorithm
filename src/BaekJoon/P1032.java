package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1032 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		String[] arr=br.readLine().split("");
		boolean[] crr=new boolean[arr.length];
		Arrays.fill(crr, true);
		for(int i=1;i<N;i++) {
			String[] brr=br.readLine().split("");
			for(int j=0;j<arr.length;j++) { 
				if(!crr[j]) continue;
				if(!arr[j].equals(brr[j])) {
					arr[j]="?";
					crr[j]=false;
				}
			}
		}
		for(String i:arr) bw.write(i);
		bw.flush();
		bw.close();
	}
}
