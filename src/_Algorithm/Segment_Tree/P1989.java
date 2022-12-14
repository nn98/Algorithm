package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1989 {
    static int i,j,l,n,a[],r,b[];
    static void o(){
        for(;j>1;j/=2,a[j]=a[j*2]+a[j*2-1],b[j]=Math.min(b[j*2],b[j*2-1]));
    }
    public static void main(String[] args)throws Exception{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(bufferedReader.readLine());
        for(l=1;l<n;l*=2);
        a=new int[l*2];
        b=new int[l*2];
        Arrays.fill(b,1000001);
        for(String s:bufferedReader.readLine().split(" ")){
            j=l+i++;
            a[j]=b[j]= Integer.parseInt(s);
            o();
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
