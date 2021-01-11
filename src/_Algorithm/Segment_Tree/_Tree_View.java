package _Algorithm.Segment_Tree;

public class _Tree_View {

	public static void main(String[] args) {
		String s=new java.util.Scanner(System.in).nextLine(),S[];
		int n=1,i,b=0;
		for(char c:s.toCharArray())if(c==',')n++;
		System.out.println(s);
		s=s.substring(1,s.length()-1);
		s=s.replaceAll(",","");
		S=s.split(" ");
		System.out.println(s);
		for(;n>0;b++) {
			n/=2;
			for(i=0;i++<b;System.out.print("\t"));
			for(i=n;i<n*2;System.out.print(S[i++]+i==n*2?"\n":" "));
		}
	}

}
