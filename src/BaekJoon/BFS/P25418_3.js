const fs = require('fs');
const filepath = process.platform === 'linux' ? '/dev/stdin' : '../input.txt';
const input = fs.readFileSync(filepath, { encoding : 'utf8' }).toString().trim();
const num = (str) => parseInt(str);

let [A, K] = input.split(' ').map(num);
let cnt = 0;
while(K != A) {
    cnt++;
    if (K%2 == 0 && K/2 >= A) {
        K/=2;
    } else {
        K--;
    }
}
console.log(cnt);