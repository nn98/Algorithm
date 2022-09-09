package Programmers.String;

import java.util.Arrays;
import java.util.HashMap;

public class P42888 {
	static public String[] solution(String[] record) {
        String b[],e="님이 들어왔습니다.@",l="님이 나갔습니다.@";
        StringBuffer f=new StringBuffer();
        HashMap<String,String>m=new HashMap();
        for(String s:record) {
        	b=s.split(" ");
        	switch(b[0]) {
        	case "Enter":
//        		if(m.get(b[1])!=null)m.remove(b[1]);
        		m.put(b[1],b[2]);
        		f.append(b[1]+e);
        		break;
        	case "Leave":
        		f.append(b[1]+l);
        		break;
        	default:
//        		if(m.get(b[1])!=null)m.remove(b[1]);
        		m.put(b[1],b[2]);
        	}
        }
        e=f.toString();
//        System.out.println(e);
        for(String s:m.keySet()) {
//        	System.out.println(s+" "+m.get(s));
        	e=e.replaceAll(s,m.get(s));
        }
        return e.split("@");
    }
	public static void main(String[] args) {
		String[]r= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(Arrays.toString(solution(r)));
	}
}
