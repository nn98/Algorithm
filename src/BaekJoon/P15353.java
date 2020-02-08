package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;
public class P15353 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next());
		System.out.print(a.add(new BigInteger(s.next())));
	}
}
/*
#include <stdio.h>
int main(){
	char car1[10000],car2[10000];
	scanf("%s %s",car1,car2);
	int a=10000,b=-1,r[10001];
	while(car1[--a]==0);
	while(car2[++b]!=0);
	b--;
	int c=0,p=0;
	while(a>=0||b>=0){
		int x=0,y=0,w=0;
		if(a>=0)x=car1[a--]-'0';
		if(b>=0)y=car2[b--]-'0';
		if(c){
			x++;
			c=0;
		}
		w=x+y;
		if(w>=10){
			c=1;
			w-=10;
		}
		r[p++]=w;
	}
	if(c)r[p]=1;
	else p--;
	while(p>=0)printf("%d",r[p--]);
}
*/