package _Algorithm.Simple_Implementation;
import java.util.*;
public class P11970 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),A[]=new int[101];
        for(;a<b;A[a++]++);
        for(;c<d;A[c++]++);
        a=b=0;
        for(;b<101;a+=A[b++]>0?1:0);
        System.out.println(a);
    }
}
