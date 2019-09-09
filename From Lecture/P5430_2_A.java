package BaekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P5430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
//		s.nextLine();
		for(int i=0;i<n;i++) {
			boolean r=false,re=false,w=false;
			int dF=0,dB=0;
			String[] c=br.readLine().split("");
			int m=Integer.parseInt(br.readLine());
//			s.nextLine();
			String a=br.readLine();
			for(String j:c) {
				switch(j) {
				case "R":
					if(r) r=false;
					else r=true;
					break;
				case "D":
					if(r) dB++;
					else dF++;
					break;
				}
				if(dF+dB==m) {
					re=true;
					continue;
				}
				if(dF+dB>m) {
					bw.write("error\n");
					re=true;
					w=true;
					break;
				}
			}
			if(re) {
				if(!w)
					bw.write("[]\n");
				continue;
			}
//			1
//			DDRDD
//			4
//			[1,2,3,4]
//			||(1+dF*2)+(Math.abs(a.length()-1-dB*2))>=a.length()
			int front=1+dF*2,back=(a.length()-1)-dB*2;
//			System.out.printf("a.length: %d df: %d dB: %d F: %d B: %d\n",a.length(), dF,dB,front,back);
			String result="[";
			if(front>=a.length()||back<0) {
				bw.write("error\n");
				continue;
			}
			String t=a.substring(1,a.length()-1);
			String[] b=t.split(",");
			if(r) {
				for(int k=b.length-1-dB;k>=dF;k--) result+=b[k]+",";
			} else {
				for(int k=dF;k<b.length-dB;k++) result+=b[k]+",";
			}
			result=result.substring(0,result.length()-1)+"]";
			bw.write(result+"\n");
		}
		bw.flush();
	}
}