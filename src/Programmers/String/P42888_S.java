package Programmers.String;
import java.util.*;
public class P42888_S {
	static public String[] solution(String[] record) {
        String b[],e="님이 들어왔습니다.",l="님이 나갔습니다.";
        List<String[]>t=new ArrayList();
        HashMap<String,String>m=new HashMap();
        for(String s:record) {
        	b=s.split(" ");
        	switch(b[0]) {
        	case "Enter":
        		m.put(b[1],b[2]);
        		String[]a={b[1],"e"};
        		t.add(a);
        		break;
        	case "Leave":
        		String[]c= {b[1],"l"};
        		t.add(c);
        		break;
        	default:
        		m.put(b[1],b[2]);
        	}
        }
        b=new String[t.size()];
        int i=0;
        for(String[]s:t) {
        	if(s[1].equals("e"))b[i++]=m.get(s[0])+e;
        	else b[i++]=m.get(s[0])+l;
        }
        return b;
    }
	public static void main(String[] args) {
		String[]r= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(Arrays.toString(solution(r)));
	}
}
