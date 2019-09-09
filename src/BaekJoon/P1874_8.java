package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1874_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()),arr[]=new int[n],add=1,now=0,index=0;
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(br.readLine());
		while(true) {
			if(now<=arr[index]) {
				bw.write("+\n");
				now=add;
				add++;
			}
			if(now==arr[index]) {
				bw.write("-\n");
				index++;
			}
		}
	}

}
