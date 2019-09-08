package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10093 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] arr=br.readLine().split(" ");
		StringTokenizer st=new StringTokenizer(br.readLine());
//		Scanner s=new Scanner(System.in);
		long f=Long.parseLong(st.nextToken()),t=Long.parseLong(st.nextToken());
		if(f==t) {
			System.out.println(0);
			return;
		}
		if(f>t) {
			long a=f;
			f=t;
			t=a;
		}
		bw.write(""+(t-f-1)+"\n");
		for(long i=f+1;i<t;i++) bw.write(""+i+" ");
		bw.flush();
	}
}
