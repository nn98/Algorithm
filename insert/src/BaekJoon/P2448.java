package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P2448 {

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=s.nextInt(),c=n/2;
		String[] de=new String[n];
		de[0]="  *  ";
		de[1]=" * * ";
		de[2]="*****";
		for(int i=3;i<n;i++) {
			if(i<c) {
				int d=c;
				while(d>i) d/=2;
				String add="";
				for(int j=0;j<d;j++) add+=" ";
				de[i]=de[i-d]+" "+de[i-d];
				de[i-d]=add+de[i-d]+add;
			}
			else 
				de[i]=de[i-c]+" "+de[i-c];
		}
		if(n==3) {
			for(int i=0;i<3;i++) 
				bw.write(de[i]+"\n");
		}
		else {
			for(int i=0;i<n;i++) {
				if(i<n/2) {
					for(int j=0;j<n/2;j++) bw.write(" ");
				}
					bw.write(de[i]);
				if(i<n/2) {
					for(int j=0;j<n/2;j++) bw.write(" ");
				}
				if(i<n-1) bw.newLine();
			}
		}
		bw.flush();
	}
}
