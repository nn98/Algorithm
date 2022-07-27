package Programmers;


public class P1835_S {	
	static String[]d;
	static char[]a,b;
	static int c[],R;
	static public int solution(int n, String[] data){
		a="ACFJMNRT".toCharArray();
		b=new char[8];
		c=new int[8];
		d=data.clone();
		R=0;
		o(0);
        return R;
    }
	static void o(int x){
		if(x==8) {
//			System.out.println(b);
			R+=p(String.valueOf(b))?1:0;
		}
		else {
			for(int i=0;i<8;i++) {
				if(c[i]<1) {
					b[x]=a[i];
					c[i]++;
					o(x+1);
					c[i]--;
				}
			}
		}
	}
	static boolean p(String s){
		boolean r=true;
		for(String x:d) {
			if(!r)break;
			char n=x.charAt(0),u=x.charAt(2);
			int dis=Integer.parseInt(x.substring(4)),rea=Math.abs(s.indexOf(n)-s.indexOf(u))-1;
			switch(x.charAt(3)) {
			case '=':
				r=r&dis==rea;
				break;
			case '>':
				r=r&rea>dis;
				break;
			case '<':
				r=r&rea<dis;
			}
		}
		return r;
	}
	public static void main(String[] args)throws Exception{
		int[]a= {2,2};
		String[][]b= {{"N~F=0", "R~T>2"},{"M~C<2", "C~M>1"}};
		for(int i=0;i<2;System.out.println(solution(a[i],b[i++])));
	}

}