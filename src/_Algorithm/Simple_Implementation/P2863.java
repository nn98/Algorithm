package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P2863 {
    public static void main(String[]z){
        Scanner s=new Scanner(System.in);
        double a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),x[]=new double[4];
        x[0]=a/c+b/d;
        x[1]=c/d+a/b;
        x[2]=c/a+d/b;
        x[3]=d/c+b/a;
        // System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]);
        a=Math.max(x[0],Math.max(x[1],Math.max(x[2],x[3])));
        for(int i=0;i<4;i++)if(a==x[i]){
            System.out.print(i);
            return;
        }
    }
}
