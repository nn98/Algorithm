class P340213 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        // int min = 5;
        // int sec = 0;
        // String time = String.format("%2d:%2d", min, sec);
        for(String com:commands) {
            pos = checkOp(pos, op_start, op_end);
            if(com.equals("next")) {
                pos = next(pos, video_len);
            } else {
                pos = prev(pos);
            }
        }
        pos = checkOp(pos, op_start, op_end);
        return pos;
    }
    public int toIntTime(String pos) {
        String[]posTime = pos.split(":");
        int time = 0;
        time += Integer.parseInt(posTime[0])*60;
        time += Integer.parseInt(posTime[1]);
        return time;
    }
    public String toStringTime(int pos) {
        int min = pos/60;
        int sec = pos%60;
        String time = String.format("%02d:%02d", min, sec);
        return time;
    }
    public String next(String pos, String video_len) {
        int now = toIntTime(pos);
        now += 10;
        int limit = toIntTime(video_len);
        if(now>limit) now = limit;
        return toStringTime(now);
    }
    public String prev(String pos) {
        int now = toIntTime(pos);
        now -= 10;
        if(now<0) now=0;
        return toStringTime(now);
    }
    public String checkOp(String pos, String op_start, String op_end) {
        int now = toIntTime(pos);
        int from = toIntTime(op_start);
        int to = toIntTime(op_end);
        if(now >= from && now <= to) {
            now = to;
        }
        return toStringTime(now);
    }
}
