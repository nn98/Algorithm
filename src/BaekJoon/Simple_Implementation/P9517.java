package BaekJoon.Simple_Implementation;

import java.io.*;
import java.util.*;
public class P9517 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		//지나간 시간을 저장 할 변수
		int time = 0;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			String Z = st.nextToken();
			
			time += T;
			
			if(time > 210) break;
			
			if(Z.equals("T")) K++;
			
			if(K == 9) K = 1;
		}
		System.out.print(K);
	}
}