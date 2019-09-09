package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P6463 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while ((s = br.readLine()) != null && s.length() != 0) {
			int t=Integer.parseInt(s),i=1,sum=1,tar=10;
			while(i<=t) {
				sum=sum*i;
				while(sum%10==0) sum/=10;
				sum%=tar;
//				System.out.println(i+"! : "+sum);
				i++;
				if(i>=tar) tar*=10;
			}
			sum%=10;
			System.out.println(t+" -> "+sum);
		}
	}

}
