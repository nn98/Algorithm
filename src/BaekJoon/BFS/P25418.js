const fs = require('fs');
const filepath = process.platform === 'linux' ? '/dev/stdin' : '../input.txt';
const input = fs.readFileSync(filepath, { encoding : 'utf8' }).toString().trim();
const num = (str) => parseInt(str);

const [N, M] = input.split(' ').map(num);
var ans = Number.MAX_SAFE_INTEGER;
var his = new Array(1000001).fill(Number.MAX_SAFE_INTEGER);

// console.log(his);

solution(N,1);
console.log(ans);

function solution(N,C) {
    console.log(N);
    his[N] = C;
    if(N === M) {
        ans = Math.min(ans, C);
        return;
    }
    C += 1;
    if(his[N*2] > C && N*2 <= M) solution(N*2,C);
    if(his[N+1] > C && N+1 <= M) solution(N+1,C);
}

console.log(ans);

