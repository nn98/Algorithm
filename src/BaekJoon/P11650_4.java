package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11650_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String[] arr=new String[200001];
//		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String[] in=br.readLine().split(" ");
			int a=Integer.parseInt(in[0])+100000;
			if(arr[a]==null) arr[a]=in[1];
			else arr[a]+=" "+in[1];
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				String[] in=arr[i].split(" ");
				for(int j=0;j<in.length;j++) {
					System.out.println(i-100000+" "+in[j]);
				}
			}
		}
	}
}
