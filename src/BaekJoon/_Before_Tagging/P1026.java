package BaekJoon._Before_Tagging;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1026 {
	//�ƴϸ� ���� max*min �ϰ� �ش簪 -1��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),arr[]=new int[n],brr[]=new int[n],sum=0;
		StringTokenizer st=new StringTokenizer(br.readLine()),sk=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			brr[i]=Integer.parseInt(sk.nextToken());
		}
		Arrays.sort(arr);
		Arrays.sort(brr);
		for(int i=0;i<n;i++) {
			sum+=arr[i]*brr[n-(i+1)];
		}
		System.out.println(sum);
	}

}
