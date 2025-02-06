const fs = require('fs');
const filepath = process.platform === 'linux' ? '/dev/stdin' : '../input.txt';
const input = fs.readFileSync(filepath, { encoding : 'utf8' }).toString().trim().split('\n');
const num = (str) => parseInt(str);

console.log(Number(input[0]));