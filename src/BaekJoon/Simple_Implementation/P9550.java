package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P9550 {
    public static void main(String[]z){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m,i,j,a[],k;
        for(;n-->0;){
            m=s.nextInt();
            k=s.nextInt();
            j=0;
            // a=new int[m];
            for(i=0;i++<m;j+=s.nextInt()/k);
            System.out.println(j);
        }
    }
}
