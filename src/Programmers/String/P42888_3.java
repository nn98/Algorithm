package Programmers.String;

import java.util.*;

public class P42888_3 {

    private static final String ENTER = "님이 들어왔습니다.";
    private static final String LEAVE = "님이 나갔습니다.";

    class Log {
        String uId;
        String event;
        Log(String uId, String event) {
            this.uId = uId;
            this.event = event;
        }
    }

    public String[] solution(String[] record) {
        LinkedList<Log> logs = new LinkedList<>();
        Map<String, String> userInfo = new HashMap<>();
        Arrays.stream(record).forEach(r -> process(r, logs, userInfo));
        List<String> answer = new ArrayList();
        logs.forEach(log -> {
            String uName = userInfo.get(log.uId);
            answer.add(uName + getEventString(log.event));
        });
        return answer.toArray(new String[0]);
    }

    public void process(String record, LinkedList<Log> logs, Map<String, String> userInfo) {
        StringTokenizer tokenizer = new StringTokenizer(record);
        String event = tokenizer.nextToken();
        String uId = tokenizer.nextToken();
        if (event.equals("Leave")) {
            logs.add(new Log(uId, event));
            return;
        }
        String uName = tokenizer.nextToken();
        userInfo.put(uId, uName);
        if (event.equals("Enter")) {
            logs.add(new Log(uId, event));
        }
    }
    public String getEventString(String value) {
        if (value.equals("Enter")) return ENTER;
        return LEAVE;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P42888_3().solution(
                new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
                        "Change uid4567 Ryan"})));
    }
}
