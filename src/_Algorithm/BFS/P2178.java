package _Algorithm.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2178 {

    static int n,m,i,j,h[][];
    static char[][]a;
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer t=new StringTokenizer(r.readLine());
	n=Integer.parseInt(t.nextToken());
	m=Integer.parseInt(t.nextToken());
	a=new char[n][m];
	h=new int[n][m];
    }

}
