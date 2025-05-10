function solution(n, p, S) {
    var answer = '';
    let his = Array(S.length).fill(1);
    for (idx = 0; idx < S.length; idx += 1) {
        if (his[idx] == 0) continue;
        add = p;
        for (nIdx = idx; nIdx < S.length && add > 0;) {
            nIdx += 1;
            if (his[nIdx] == 1) {
                add -= 1;
                if (add == 0) {
                    if (S[nIdx] != S[idx]) {
                        his[nIdx] = 0;
                        add += 1;
                    }
                }
            }
        }
    }
    // 람다로 필터?
    answer = his.join('');
    return answer;
}