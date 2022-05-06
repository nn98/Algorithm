package _Algorithm.Two_Pointer;

public class P2018_2 {

    public static void main(String[] args) {
	int n=new java.util.Scanner(System.in).nextInt(),i=1,j=1,u=0,r=1;
	for(;j<n&u<n;) {
	    //	    System.out.println(u);
	    if(n==u) {
		r++;
		//		System.out.println(u+" "+j+" -"+i);
	    }
	    u-=i++;
	}
	System.out.println(r);
    }

}
