package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P15483 {
	public static void main(String[]z) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		char[]q=b.readLine().toCharArray(),w=b.readLine().toCharArray();
		if(q.length<w.length) {
			char[]t=q;
			q=w;
			w=t;
		}
		System.out.println(Arrays.toString(q));
		System.out.println(Arrays.toString(w));
		int r=q.length;
		for(int i=0;i<w.length;i++) {
			for(int j=0;j<q.length;j++) {
				if(w[i]==q[j]) {
					System.out.println(q[j]);
					q[j]=' ';
					r--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(q));
		System.out.println(Arrays.toString(w));
		System.out.print(r);
	}
}