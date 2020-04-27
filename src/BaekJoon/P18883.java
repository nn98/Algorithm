package BaekJoon;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P18883 {

	public static void main(String[] args)throws Exception{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0;
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		for(;i<n*m;w.write(++i%m==0?i+"\n":i+" "));
	}

}
