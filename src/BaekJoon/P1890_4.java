package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class P1890_4 {
	//채점 50퍼에서 빠꾸나면 이유나 알려주던가
	//뭔자이여 시벌
	static long n,arr[][],history[][];
	
//	static void sol(int x,int y) {
//		
//	}
	
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
		history[0][0]=1;
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {
				int v=(int) arr[x][y];
				if(history[x][y]==0||v==0) continue;
				if(x+v<n) history[x+v][y]+=history[x][y];
				if(y+v<n) history[x][y+v]+=history[x][y];
			}
		}
//		sol(0,0);
//		for(long i=0;i<n;i++) System.out.prlongln(Arrays.toString(arr[i]));
//		for(long i=0;i<n;i++) System.out.prlongln(Arrays.toString(history[i]));
//		for(int i=0;i<n;i++) bw.write(Arrays.toString(history[i])+"\n");
		bw.write(""+history[(int) (n-1)][(int) (n-1)]);
		bw.flush();
	}
}