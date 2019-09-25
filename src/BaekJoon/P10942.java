package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10942 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()),arr[]=new int[n];
		String[] in=br.readLine().split(" ");
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(in[i]);
		int m=Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++) {
			boolean c=false;
			in=br.readLine().split(" ");
			int a=Integer.parseInt(in[0]),b=Integer.parseInt(in[1]);
			if(a==b) c=true;
			else {
				int count=b-a;
				a-=1;
				b-=1;
				for(int j=0;j<count;j++) {
					if(!(arr[a+j]==arr[b-j])) {
//						System.out.printf("%d %d\n",arr[a+j],arr[b-j]);
						c=false;
						break;
					}
					c=true;
				}
			}
			if(c) bw.write("1\n");
			else bw.write("0\n");
		}
		bw.flush();
	}
}
