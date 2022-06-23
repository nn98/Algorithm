package Programmers;

public class P42883_2 {
    static char[]a;
    static int i,l;
    static String s="0",d;
    static void o(int x,int v) {
    	if(v!=0) {
    		a[x]='X';
    		o(x+1,v-1);
    	}else {
    		d=a.toString().replaceAll("X","");
    		s=s.compareTo(d)>0?d:s;
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
