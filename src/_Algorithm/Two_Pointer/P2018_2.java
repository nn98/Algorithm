package _Algorithm.Two_Pointer;
public class P2018_2 {
    public static void main(String[] args) {
	int n=new java.util.Scanner(System.in).nextInt(),i=1,j=1,u=0,r=1;
	for(;j<n;) {
	    while(u>n)u-=i++;
	    while(u<n)u+=j++;
	    if(n==u) {
		r++;
		u+=j++;
	    }
	}
	System.out.println(r);
    }
}
// 반복문 2개 위치차이;