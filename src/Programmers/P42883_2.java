package Programmers;

public class P42883_2 {
    static char a[];
    static int i,l;
    static String s,d;
    static void o(int x,int v) {
//    	System.out.println(a);
//    	System.out.println(x+" "+v);
    	if(v==0) {
//    		System.out.println(a);
    		d=new String(a).replaceAll("X","");
//    		System.out.println("d: "+d);
    		if(s==null)s=d;
    		else s=s.compareTo(d)<0?d:s;
    	}
    	else if(x==a.length)return;
    	else if(v!=0) {
    		char b=a[x];
    		a[x]='X';
    		o(x+1,v-1);
    		a[x]=b;
    		o(x+1,v);
    	}
    }
	public static String solution(String number, int k) {
		l=number.length()-k;
        String answer = "";
        a=number.toCharArray();
        o(0,k);
        return s;
    }
	public static void main(String[] args) {
		System.out.println(solution("1924",2));
	}

}
