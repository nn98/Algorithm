package BaekJoon;
import java.util.*;
class P1620_S{
	public static void main(String[]z){
		Scanner c=new Scanner(System.in);
		HashMap<String,String>map=new HashMap<>();
		int n=c.nextInt(),m=c.nextInt();
		for(int i=1;i<=n;i++){
			String s=c.next();
			map.put(s, ""+i);
			map.put(""+i,s);
		}
		for(int i=0;i<m;i++)System.out.println(map.get(c.next()));
	}
}