package BaekJoon.Prefix_Sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11658_2 {
    static void o(int i,int j,int[][]v,int[][]a){
//        for(int k=j;k<a[i].length;a[i][k++]+=v);
        a[i][j]=v[i-1][j-1]+a[i-1][j]+a[i][j-1]-a[i-1][j-1];
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(reader.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),i=0,j,
                a[][]=new int[n+1][n+1],v[][]=new int[n][n],x1,y1,x2,y2;
        for(;i<n;i++){
            st=new StringTokenizer(reader.readLine());
            for(j=0;j<n;v[i][j]=Integer.parseInt(st.nextToken()),o(i+1,j+++1,v,a));
        }
        for(int[]b:a) System.out.println(Arrays.toString(b));
        for(;m-->0;){
            st=new StringTokenizer(reader.readLine());
            i=Integer.parseInt(st.nextToken());
            x1=Integer.parseInt(st.nextToken());
            y1=Integer.parseInt(st.nextToken());
            if(i<1){
                j=Integer.parseInt(st.nextToken());
                v[x1-1][y1-1]=j;
                o(x1,y1,v,a);
                for(int[]b:a) System.out.println(Arrays.toString(b));
            }else {
                x2=Integer.parseInt(st.nextToken());
                if(x2<x1){
                    int t=x1;
                    x1=x2;
                    x2=t;
                }
                y2=Integer.parseInt(st.nextToken());
                if(y2<y1){
                    int t=y1;
                    y1=y2;
                    y2=t;
                }

//                for(;x1<=x2;V+=a[x1][y2]-(y1<1?0:a[x1++][y1-1]));
                writer.write(a[x2][y2]-a[x1-1][y2]-a[x2][y1-1]+a[x1-1][y1-1]+"\n");
            }
        }
        writer.flush();
    }
}
