package _Contest.C915;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2 {
    static int n,m,i,a[],j,b[];
    static long v,l,r,L,R;
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer=new StringTokenizer(reader.readLine());
        n=Integer.parseInt(stringTokenizer.nextToken());
        m=Integer.parseInt(stringTokenizer.nextToken())-1;
        a=new int[n];
        stringTokenizer=new StringTokenizer(reader.readLine());
        for(;i<n;a[i++]=Integer.parseInt(stringTokenizer.nextToken()));
        v+=a[m];
        i=m-1;
        j=m+1;
        for(;;){
            if(i>=0){
                if(l+R>=0)
                    l+=a[i];
            }
        }
        System.out.println(r);
    }
}
