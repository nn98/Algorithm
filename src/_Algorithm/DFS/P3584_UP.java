package _Algorithm.DFS;
import java.io.*;
import java.util.Arrays;
public class P3584_UP {
	static int 노드,노드개수,케이스,연결정보[][],기록[],결과;
	static void o(int x) {
		if(기록[x]>0)결과=x;
		else {
			기록[x]++;
			for(int y=0;++y<노드개수;)if(연결정보[x][y]>0)o(y);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		for(케이스=Integer.parseInt(r.readLine());케이스-->0;) {
			노드개수=노드=Integer.parseInt(r.readLine())+1;
			String[]입력;
			연결정보=new int[노드][노드];
			기록=new int[노드];
			for(;--노드>1;) {
				입력=r.readLine().split(" ");
				연결정보[Integer.parseInt(입력[1])][Integer.parseInt(입력[0])]++;
			}
//			for(int[]c:a)System.out.println(Arrays.toString(c));
			입력=r.readLine().split(" ");
			o(Integer.parseInt(입력[0]));
			o(Integer.parseInt(입력[1]));
//			System.out.println(R);
			w.write(결과+"\n");
		}
		w.flush();
	}

}
