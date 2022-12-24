package _Algorithm.Prefix_Sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11658 {
    static void o(int i,int j,int v,int[][]a){
        for(int k=j;k>=0;a[i][k--]+=v);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(reader.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),i=0,j,
                a[][]=new int[n][n],v[][]=new int[n][n],x1,y1,x2,y2;
        for(;i<n;i++){
            st=new StringTokenizer(reader.readLine());
            for(j=0;j<n;v[i][j]=Integer.parseInt(st.nextToken()),o(i,j,v[i][j++],a));
        }
        for(int[]b:a) System.out.println(Arrays.toString(b));
        for(;m-->0;){
            st=new StringTokenizer(reader.readLine());
            i=Integer.parseInt(st.nextToken());
            x1=Integer.parseInt(st.nextToken())-1;
            y1=Integer.parseInt(st.nextToken())-1;
            if(i<1){
                j=Integer.parseInt(st.nextToken());
                int V=j-v[x1][y1];
                v[x1][y1]=j;
                o(x1,y1,V,a);
            }else {
                x2=Integer.parseInt(st.nextToken())-1;
                if(x2<x1){
                    int t=x1;
                    x1=x2;
                    x2=t;
                }
                y2=Integer.parseInt(st.nextToken())-1;
                if(y2<y1){
                    int t=y1;
                    y1=y2;
                    y2=t;
                }
                int V=0;
                for(;x1<=x2;x1++,V+=y1-y2);
                writer.write(V+"\n");
            }
        }
        writer.flush();
    }
}
