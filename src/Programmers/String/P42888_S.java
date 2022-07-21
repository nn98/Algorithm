package Programmers.String;

import java.util.*;

public class P42888_S {
	static public String[] solution(String[] record) {
        String b[],e="님이 들어왔습니다.",l="님이 나갔습니다.";
//        StringBuffer f=new StringBuffer();
        List<String[]>t=new ArrayList();
        HashMap<String,String>m=new HashMap();
        for(String s:record) {
        	b=s.split(" ");
        	switch(b[0]) {
        	case "Enter":
//        		if(m.get(b[1])!=null)m.remove(b[1]);
        		m.put(b[1],b[2]);
        		String[]a={b[1],"e"};
//        		f.append(b[1]+e);
        		t.add(a);
        		break;
        	case "Leave":
//        		f.append(b[1]+l);
        		String[]c= {b[1],"l"};
        		t.add(c);
        		break;
        	default:
//        		if(m.get(b[1])!=null)m.remove(b[1]);
        		m.put(b[1],b[2]);
        	}
        }
//        e=f.toString();
//        System.out.println(e);
//        for(String[]s:t)System.out.println(Arrays.toString(s));
        b=new String[t.size()];
        int i=0;
        for(String[]s:t) {
//        	System.out.println(s+" "+m.get(s));
//        	e=e.replaceAll(s,m.get(s));
//        	System.out.println(Arrays.toString(s));
//        	System.out.println(s[1]);
//        	System.out.println(m.get(s[0]));
//        	System.out.println(s[1].equals("e"));
        	if(s[1].equals("e"))b[i++]=m.get(s[0])+e;
        	else b[i++]=m.get(s[0])+l;
//        	System.out.println(Arrays.toString(b));
        }
        return b;
    }
	public static void main(String[] args) {
		String[]r= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(Arrays.toString(solution(r)));
	}
}
