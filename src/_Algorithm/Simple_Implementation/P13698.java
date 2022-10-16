package _Algorithm.Simple_Implementation;

public class P13698 {
	static void o(int x,int y) {
		t=a[x];
		a[x]=a[y];
		a[y]=t;
	}
	static int t,a[]= {1,0,0,2};
	public static void main(String[] args) {
		for(char c:new java.util.Scanner(System.in).next().toCharArray())
			switch(c) {
			case 'A':
				o(0,1);
				break;
			case 'B':
				o(0,2);
				break;
			case 'C':
				o(0,3);
				break;
			case 'D':
				o(1,2);
				break;
			case 'E':
				o(1,3);
				break;
			case 'F':
				o(2,3);
				break;
			}
		for(t=0;t<4;System.out.print(a[t]==1?t+"\n":""));
		for(t=0;t<4;System.out.print(a[t]==2?t:""));
	}

}
