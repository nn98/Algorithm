package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1287 {

	static char[] input;
	static int r,re[];

	static void sol(int f,int t) {
		for(int i=f;i<=t;i++) {
			if(input[i]=='*') {
				re[i-1]=re[i-1]*re[i+1];
				re[i+1]=re[i-1];
				r=re[i-1];
			} else if(input[i]=='/') {
				re[i-1]=re[i-1]/re[i+1];
				re[i+1]=re[i-1];
				r=re[i-1];
			}
		}
		for(int i=f;i<=t;i++) {
			if(input[i]=='+') {
				re[i-1]=re[i-1]+re[i+1];
				re[i+1]=re[i-1];
				r=re[i-1];
			} else if(input[i]=='-') {
				re[i-1]=re[i-1]-re[i+1];
				re[i+1]=re[i-1];
				r=re[i-1];
			}
		}
	}
	static void sol1(int f,int t) {
		sol(f+1,t-1);
		re[f]=r;
		re[t]=r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//		StringBuilder input=new StringBuilder(s.next());
		input=s.next().toCharArray();
		re=new int[input.length];
		for(int i=0;i<re.length;i++) {
			if(input[i]=='+'||input[i]=='-'||input[i]=='*'||input[i]=='/'||input[i]=='('||input[i]==')') continue;
			else re[i]=input[i]-'0';
		}
		System.out.println(Arrays.toString(re));
		int rf=0,rt=0;
		while(!(rf==-1&&rt==-1)) {
			rf=-1;
			rt=-1;
			for(int i=0;i<input.length;i++) {
				if(input[i]=='(') rf=i;
				if(input[i]==')') {
					rt=i;
					sol1(rf,rt);
					input[rf]=' ';
					input[rt]=' ';
					break;
				}
			}
		}
		System.out.println(Arrays.toString(re));
		sol(0,re.length-1);
		System.out.println(Arrays.toString(re));
		System.out.println(r);
//		sol(0,input.length-1);
//		System.out.println(Arrays.toString(input));
	}
}