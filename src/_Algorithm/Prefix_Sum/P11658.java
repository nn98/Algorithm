package _Algorithm.Prefix_Sum;
// 채점 시스템 개 병신같네 진짜
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11658 {
    static int n,m,i,j,a[][],v[][],x1,y1,x2,y2,d,t,J;
    static void o(){
        J=j;
        d=t-v[i][j];
        for(;J<n;a[i][J++]+=d);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(reader.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        a=new int[n][n];
        v=new int[n][n];
        for(;i<n;i++){
            st=new StringTokenizer(reader.readLine());
            for(j=0;j<n;t=Integer.parseInt(st.nextToken()),o(),v[i][j++]=t);
        }
//        for(int[]b:a) System.out.println(Arrays.toString(b));
        for(;m-->0;){
            st=new StringTokenizer(reader.readLine());
            i=Integer.parseInt(st.nextToken());
            x1=Integer.parseInt(st.nextToken())-1;
            y1=Integer.parseInt(st.nextToken())-1;
            if(i<1){
                t=Integer.parseInt(st.nextToken());
                i=x1;
                j=y1;
//                System.out.println(i+" "+j+" "+t);
                o();
                v[i][j]=t;
//                for(int[]b:a) System.out.println(Arrays.toString(b));
            }else {
                x2=Integer.parseInt(st.nextToken())-1;
                if(x2<x1){
                    t=x1;
                    x1=x2;
                    x2=t;
                }
                y2=Integer.parseInt(st.nextToken())-1;
                if(y2<y1){
                    t=y1;
                    y1=y2;
                    y2=t;
                }
//                뭐가다른건데 시발련아 도대체
//                int V=0;
//                for(;x1<=x2;V+=a[x1][y2]-(y1<1?0:a[x1++][y1-1]));
                long ret = 0;
                for (int i = x1; i <= x2; i++) {
                    ret += a[i][y2];
                    if (y1 > 0) ret -= a[i][y1 - 1];
                }
                writer.write(ret+"\n");
            }
        }
        writer.flush();
    }
}
