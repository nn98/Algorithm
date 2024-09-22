package Programmers.Test.Kakao2022_2;

import java.util.*;


public class P01 {
	static public int[] solution(String t, String[]s, String[]p) {
        String[]a=t.split("\\.");
        System.out.println(Arrays.toString(a));
        int A[]= {Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2])},
        		r[],i=0,j=0,S[]=new int[26],B[]=new int[3];
        List<Integer>l=new ArrayList();
        
        for(;i<s.length;i++) {
        	String[]C=s[i].split(" ");
        	S[C[0].charAt(0)-'A']=Integer.parseInt(C[1]);
        }
        for(i=0;i<p.length;i++) {
        	String[]D=p[i].split(" "),C=D[0].split("\\.");
        	B[0]=Integer.parseInt(C[0]);
        	B[1]=Integer.parseInt(C[1])+S[D[1].charAt(0)-'A'];
        	B[2]=Integer.parseInt(C[2])-1;
        	if(B[2]==0) {
        		B[1]-=1;
        		B[2]=28;
        	}
        	if(B[1]==0) {
        		B[0]-=1;
        		B[1]=12;
        	}
        	if(B[1]>12) {
        		B[1]-=12;
        		B[0]++;
        	}
//        	System.out.println(i+"B "+Arrays.toString(B));
        	if(B[0]<A[0])
    			l.add(i+1);
        	else if(B[0]==A[0]){
        		if(B[1]<A[1]) {
        			l.add(i+1);
        			continue;
        		}else if(B[1]==A[1]) {
        			if(B[2]<A[2]) {
            			l.add(i+1);
            			continue;
        			}
        		}
        	}
        }
//        System.out.println(l.toString());
        r=l.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return r;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("2022.05.19",new String[] 
				{"A 6","B 12","C 3"},new String[] {"2021.05.02 A","2021.07.01 B",
						"2022.02.19 C","2022.02.20 C"})));
	}

}
