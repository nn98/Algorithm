package Programmers.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P42888_2 {

    public String[] solution(String[] record) {
        Map<String, List<String>> events = new HashMap();
        Map<String, String> names = new HashMap();
        for(String recordData : record) {
            String[] records = recordData.split(" ");
            process(events,names,records);
        }
        List<String> result = new ArrayList<>();
        events.forEach((key, value) -> {
            String uName = names.get(key);
            List<String> event = value;
            buildResult(uName, event, result);
        });
        return result.toArray(new String[0]);
    }

    private void buildResult(String uName, List<String> event, List<String> result) {
        event.forEach(record -> {
            String text = "";
            if(record.equals("Enter")) {
                text = uName + "님이 들어왔습니다.";
            }
            if(record.equals("Leave")) {
                text = uName + "님이 나갔습니다.";
            }
            result.add(text);
        });
    }

    private void process(Map<String, List<String>> events, Map<String, String> names, String[] records) {
        if (records.length < 3) {
            events.putIfAbsent(records[1], new ArrayList<>());
            events.get(records[1]).add(records[0]);
            return;
        }
        String event = records[0];
        String uId = records[1];
        String uName = records[2];
        if (event.equals("Change")) {
            names.put(uId, uName);
            return;
        }
        names.putIfAbsent(uId, uName);
        events.putIfAbsent(uId, new ArrayList<>());
        events.get(uId).add(event);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P42888_2().solution(
                new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
                        "Change uid4567 Ryan"})));
    }
}
