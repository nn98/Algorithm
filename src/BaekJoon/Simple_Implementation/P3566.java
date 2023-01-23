package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P3566 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = -1, i = 0, n, b[] = new int[5], j,w,h,M;
        double[]a=new double[4];
        for (; i < 4; a[i++] = s.nextInt())
            ;
        n = s.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < 5; b[j++] = s.nextInt())
                ;
            w=(int)Math.max(Math.ceil(a[0]/b[0]),Math.ceil(a[2]/b[2]));
            h=(int)Math.max(Math.ceil(a[1]/b[1]),Math.ceil(a[3]/b[3]));
            M=w*h;
            w=(int)Math.max(Math.ceil(a[0]/b[1]),Math.ceil(a[2]/b[3]));
            h=(int)Math.max(Math.ceil(a[1]/b[0]),Math.ceil(a[3]/b[2]));
            M=Math.min(w*h,M);
            M*=b[4];
            if(r<0)r=M;
            r=r<M?r:M;
        }
        System.out.println(r);
    }
}
