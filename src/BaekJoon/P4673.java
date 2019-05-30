package BaekJoon;

public class P4673 {

	static int[] arr=new int[10001];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10000;i++) {
			String[] s=Integer.toString(i).split("");
			int j=i;
			for(String a:s) j+=Integer.parseInt(a);
			for(;j<=10000;) {
				if(arr[j]!=0) break;
				arr[j]++;
				s=Integer.toString(j).split("");
				for(String a:s) j+=Integer.parseInt(a);
			}
		}
		for(int i=1;i<arr.length;i++) 
			if(arr[i]==0)
				System.out.println(i);
	}
}
