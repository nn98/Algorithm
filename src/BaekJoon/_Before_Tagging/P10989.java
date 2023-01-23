package BaekJoon._Before_Tagging;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
//--------------------------?? ���Ĺ����� �ƴ϶� �� ���ۻ�빮��?
public class P10989 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++) {
			bw.write(Integer.toString(arr[i])+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
