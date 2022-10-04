package _Algorithm.Simple_Implementation;
import java.util.*;
class P9501{
    public static void main(String[]z){
        Scanner s=new Scanner(System.in);
        double n=s.nextInt(),m,l,a,b,c,r;
        for(;n-->0;){
            m=s.nextInt();
            l=s.nextInt();
            r=0;
            for(;m-->0;){
                a=s.nextInt();
                b=s.nextInt();
                c=s.nextInt();
                r+=a*b/c>l?1:0;
            }
            System.out.println(r);
        }
    }
}