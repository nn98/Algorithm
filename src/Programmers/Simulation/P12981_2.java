package Programmers.Simulation;
// dk tlqkf
import java.util.Arrays;

public class P12981_2 {
	static public int[] solution(int n,String[]w) {
        int r=0,i=0,j,c,l=w.length,e=0;
        for(;r<1&++i<l;) {
        	r+=w[i].charAt(0)!=w[i-1].charAt(w[i-1].length()-1)?1:0;
        	for(j=i;j-->0;) {
        		r+=w[i].equals(w[j])?1:0;
        	}
        }
        i--;
        System.out.println(i);
        return new int[] {r<1?0:i%n+1,r<1?0:i/n+1};
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3,new String[]{
				"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
		System.out.println(Arrays.toString(solution(5,new String[]{
				"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
		System.out.println(Arrays.toString(solution(2,new String[]{
				"hello", "one", "even", "never", "now", "world", "draw"})));
	}

}
