package BaekJoon.BFS;
// 시 발 
import java.util.*;
public class P12851_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt(),i=0,j,l=100001,a[]=new int[l*2],r=Integer.MAX_VALUE,R=0,X;
        Arrays.fill(a,-1);
        a[n]=0;
        Queue<Integer>q=new LinkedList();
        q.add(n);
        if(n==m){
            System.out.print(0+"\n"+1);
            return;
        }
        while(!q.isEmpty()) {
            j=q.poll();
            i=a[j];
            if(j==m) {
                if(r>i) {
                    r=i;
                    R=0;
                }
                if(r==i) {
                    R++;
                }
            }
            if(i<r) {
                X=j*2;
                i++;
                if(X<l)if(a[X]>=i|a[X]<0) {
                    q.add(X);
                    a[X]=i;
                }
                X=j+1;
                if(X<l)if(a[X]>=i|a[X]<0) {
                    q.add(X);
                    a[X]=i;
                }
                X=j-1;
                if(X>=0)if(a[X]>=i|a[X]<0) {
                    q.add(X);
                    a[X]=i;
                }
            }
        }
        System.out.print(r+"\n"+R);
    }
}