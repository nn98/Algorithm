package _Algorithm.DFS;
import java.io.*;
import java.util.Arrays;
public class P3584_UP {
	static int 노드,노드개수,케이스,연결정보[][],h[],R;
	static void o(int x) {
		if(h[x]>0)R=x;
		else {
			h[x]++;
			for(int y=0;++y<노드개수;)if(연결정보[x][y]>0)o(y);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		for(케이스=Integer.parseInt(r.readLine());케이스-->0;) {
			노드개수=노드=Integer.parseInt(r.readLine())+1;
			String[]b;
			연결정보=new int[노드][노드];
			h=new int[노드];
			for(;--노드>1;) {
				b=r.readLine().split(" ");
				연결정보[Integer.parseInt(b[1])][Integer.parseInt(b[0])]++;
			}
//			for(int[]c:a)System.out.println(Arrays.toString(c));
			b=r.readLine().split(" ");
			o(Integer.parseInt(b[0]));
			o(Integer.parseInt(b[1]));
//			System.out.println(R);
			w.write(R+"\n");
		}
		w.flush();
	}

}
