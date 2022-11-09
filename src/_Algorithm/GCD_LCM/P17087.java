package _Algorithm.GCD_LCM;

import java.util.Scanner;

public class P17087 {
    static int o(int a,int b) {
        int c=a%b;
        while(c>0) {
            a=b;
            b=c;
            c=a%b;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt(),a[]=new int[n],i=0,r=0;
        for(;i<n;a[i++]=s.nextInt(),r=r<1?a[i-1]:o(r,a[i-1]));
        System.out.println(r);
    }

}
