package BaekJoon._Before_Tagging;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1850 {

	//���� Ŀ�� ��ĳ�� ���� �ð��ʰ� �߻�.
	
	static long sol(long a,long b) {
		if(a>b) {
			long t=a;
			a=b;
			b=t;
		}
		long t=-1;
		while((t=b%a)!=0) {
			b=a;
			a=t;
		}
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String in[]=br.readLine().split(" ");
		long a=Long.parseLong(in[0]),b=Long.parseLong(in[1]);
		for(long i=0;i<sol(a,b);i++) {
			bw.write("1");
		}
		bw.flush();
	}
}
