package BaekJoon.Math;

import BaekJoon._Contest.c819.B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class P6588 {

    public static void main(String[] args) throws Exception {
        boolean[] arr=new boolean[1000000];
        for(int i=2;i<arr.length;i++)if(!arr[i])for(int j=i+i;j<arr.length;j+=i)arr[j]=true;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        while(n!=0) {
            boolean f=false;
            for(int i=2;i<n;i++) {
                if(!arr[i]&&!arr[n-i]) {
                    System.out.println(n+" = "+i+" + "+(n-i));
                    f=true;
                    break;
                }
            }
            if(!f) System.out.println("Goldbach's conjecture is wrong.");
            n=Integer.parseInt(reader.readLine());
        }
    }
}