package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P5430_5 {
	//Sea Bar
	//아니이 씨ㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣ발 StringBuilder안쓰고 String써서 에러 이지랄 ㅋㄴㅇ래ㅑㅋㄴ오ㅓㄹㅋㄴ애ㅑ
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			char[] command=br.readLine().toCharArray();
			int count=Integer.parseInt(br.readLine()),f=0,t=0,ac=0,s,e;
			String elements=br.readLine();
			StringBuilder sb=new StringBuilder();
			for(char c:command) {
				switch(c) {
				case 'R':
					if(ac==0) ac=1;
					else ac=0;
					break;
				case 'D':
					count--;
					if(ac==0) f++;
					else t++;
					break;
				}
			}
//			System.out.printf("el: %d f: %d t: %d\n",elements.length(),f,t);
			if(count<0) {
				sb.append("error");
			}
			else if(count==0) sb.append("[]");
			else {
				if(f==0) s=1;
				else for(s=0;f>0;s++) 
					if(elements.charAt(s)==',') f--;
				if(t==0) e=elements.length()-1;
				else {
					for(e=elements.length()-1;t>0;e--)
						if(elements.charAt(e)==',') t--;
					e++;
				}
					
//				System.out.printf("%s , s:%d , e:%d\n",elements,s,e);
				if(ac==0) {
					sb.append("[");
					sb.append(elements.substring(s,e));
					sb.append("]");
				}
				else {
					sb.append("[");
//					r+=elements.substring(s,e);
					String[] add=elements.substring(s,e).split(",");
					for(int j=add.length-1;j>=0;j--) {
						if(j==0) sb.append(add[j]);
						else sb.append(add[j]+",");
					}
					sb.append("]");
//					StringBuilder sb=new StringBuilder(r);
//					r=sb.reverse().toString();
				}
			}
			bw.write(sb.toString()+"\n");
		}
		bw.flush();
	}
}