const fs = require('fs');
const filepath = process.platform === 'linux' ? '/dev/stdin' : '../input.txt';
const input = fs.readFileSync(filepath, { encoding : 'utf8' }).toString().trim().split('\n');

let n = Number(input[0]);
let arr = input.slice(1).map(Number);
console.log('arr',arr);
let dp = Array.from({length: n}, () => new Array(3).fill(0));
for (let i = 0; i < n; i++) {
  solution(i);
}
console.log(dp.join('\n'));

function solution(idx) {
  if(idx == 0) {
    dp[idx][0] = dp[idx][1] = arr[idx];
  } else {
    dp[idx][0] = arr[idx] + dp[idx-1][2];
    dp[idx][1] = arr[idx] + dp[idx-1][0];
    dp[idx][2] = Math.max(...dp[idx-1]);
  }
}
