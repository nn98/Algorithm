package _Algorithm.Prefix_Sum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11658 {
    static void o(int i,int j,int v,int[][]a){
        for(int k=j;k>=0;a[i][k--]+=v);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(reader.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),i=0,j,
                a[][]=new int[n][n],v[][]=new int[n][n],x1,y1,x2,y2;
        for(st=new StringTokenizer(st.nextToken());i<n;i++,st=new StringTokenizer(st.nextToken()))
            for(j=0;j<n;v[i][j]=Integer.parseInt(st.nextToken()),o(i,j,v[i][j++],a));
        for(int[]b:a) System.out.println(Arrays.toString(b));
        for(st=new StringTokenizer(st.nextToken());m-->0;st=new StringTokenizer(st.nextToken())){
            i=Integer.parseInt(st.nextToken());
            x1=Integer.parseInt(st.nextToken());
            y1=Integer.parseInt(st.nextToken());
            if(i<1){
                j=Integer.parseInt(st.nextToken());

            }
        }
    }
}
