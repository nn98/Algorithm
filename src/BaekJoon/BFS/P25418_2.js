const fs = require('fs');
const filepath = process.platform === 'linux' ? '/dev/stdin' : '../input.txt';
const input = fs.readFileSync(filepath, { encoding : 'utf8' }).toString().trim();
const num = (str) => parseInt(str);

const [N, M] = input.split(' ').map(num);
var ans = Number.MAX_SAFE_INTEGER;
var his = new Array(1000001).fill(Number.MAX_SAFE_INTEGER);

// console.log(his);

solution(M,1);
console.log(ans);

function solution(M,C) {
    console.log(M);
    his[M] = C;
    if(M === N) {
        ans = Math.min(ans, C);
        return;
    }
    C += 1;
    if(M%2 === 0) {
        if(M/2 >= 0) {
            if(M/2 >= N) {
                if(his[M/2] > C) solution(M/2,C);
            } else {
                let dis = M-N;
                if(his[N]>C+dis-1) solution(N,C+dis-1);
            }
        }
    }
    if(his[M-1] > C && M-1 >= N) solution(M-1,C);
    // if(his[N]>C) solution(N,C);
}

console.log(ans);

