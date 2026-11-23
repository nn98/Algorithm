package Programmers.Data_Structure;

import java.util.HashMap;
import java.util.Map;

public class P42576 {

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> p = new HashMap<>();
        for (String name : participant) {
            p.putIfAbsent(name, 0);
            p.put(name, p.get(name) + 1);
        }
        for (String name : completion) {
            p.merge(name, -1, Integer::sum);
        }
        return p.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey();
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }
}
