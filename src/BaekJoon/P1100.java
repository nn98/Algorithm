package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1100 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr;
		int r=0;
		for(int i=0;i<8;i++) {
			arr=br.readLine().split("");
			for(int j=0;j<arr.length;j++) if(arr[j].equals("F")) if((i+j)%2==0) r++;
		}
		System.out.println(r);
	}
}
