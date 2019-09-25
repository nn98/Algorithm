package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class P1890_3 {

	static long n,arr[][],history[][];
	
	static long sol(long x,long y) {
		if(x>=n||y>=n) return 0;
		if(arr[(int) x][(int) y]==0) return history[(int) x][(int) y]=1;
		long r=0;
		if((x+arr[(int) x][(int) y])<n&&history[(int) (x+arr[(int) x][(int) y])][(int) y]!=0) r+=history[(int) (x+arr[(int) x][(int) y])][(int) y];
		else r+=sol(x+arr[(int) x][(int) y],y);
		if((y+arr[(int) x][(int) y])<n&&history[(int) x][(int) (y+arr[(int) x][(int) y])]!=0) r+=history[(int) x][(int) ((int) y+arr[(int) x][(int) y])];
		else r+=sol(x,y+arr[(int) x][(int) y]);
		return history[(int) x][(int) y]=r;
	}
	//
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Long.parseLong(br.readLine());
		arr=new long[(int) n][(int) n];
		history=new long[(int) n][(int) n];
		StringTokenizer st;
		for(long i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			for(long j=0;j<n;j++)
				arr[(int) i][(int) j]=Long.parseLong(st.nextToken());
		}
		sol(0,0);
//		for(long i=0;i<n;i++) System.out.prlongln(Arrays.toString(arr[i]));
//		for(long i=0;i<n;i++) System.out.prlongln(Arrays.toString(history[i]));
//		for(int i=0;i<n;i++) bw.write(Arrays.toString(history[i])+"\n");
		bw.write(""+history[0][0]);
		bw.flush();
	}
}
