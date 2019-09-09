package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P5430_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			char[] command=br.readLine().toCharArray();
			int count=Integer.parseInt(br.readLine()),f=0,t=0,ac=0;
			String[] elements=br.readLine().replace("[","").replace("]","").split(",");
			for(char c:command) {
				switch(c) {
				case 'R':
					if(ac==0) ac=1;
					else ac=0;
					break;
				case 'D':
					if(ac==0) f++;
					else t++;
					break;
				}
			}
			if(count<f+t) bw.write("error\n");
			else {
				String r="[";
				if(ac==0) {
					for(int j=f;j<elements.length-t;j++) {
						r+=elements[j]+",";
					}
					r=r.substring(0,r.length()-1)+"]";
				}
				else {
					for(int j=t-1;j>=f;j--) {
						r+=elements[j]+",";
					}
					r=r.substring(0,r.length()-1)+"]";
				}
				bw.write(r+"\n");
			}
		}
		bw.flush();
	}
}