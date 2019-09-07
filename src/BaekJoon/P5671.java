package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5671 {
	//Scanner 문제인지 거지같은 백준 채점이 문제인지
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String o;
		while((o=br.readLine())!=null) {
			if(o.equals("")) break;
			String[] or=o.split(" ");
			int a=Integer.parseInt(or[0]),b=Integer.parseInt(or[1]),sum=0;
			for(int i=a;i<=b;i++) {
				String in=""+i;
				boolean c=false;
				for(int j=0;j<in.length()-1;j++) {
					for(int k=j+1;k<in.length();k++) {
						if(in.charAt(j)==in.charAt(k)) {
							c=true;
							break;
						}
					}
					if(c) break;
				}
				if(!c) sum++;
			}
			System.out.println(sum);
		}
		
	}

}
