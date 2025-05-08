const fs = require('fs');
const filePath = process.platform === "linux" ? "/dev/stdin" : "../input.txt";
const input = fs.readFileSync(filePath, 'utf8').toString().trim().split('\n');
const num = (str) => parseInt(str);

solution(input);

function solution(input) {
    const [N, M] = input[0].split(' ').map(num);
    const nums = input[1].split(' ').map(num).sort((a, b) => a-b);
    const set = [...new Set(nums).values()];
    let ans = [];
    let his = [];

    build(0);
    console.log(his.join('\n'));
    function build(index) {
        if(index === M) {
            let answer = '';
            for(let i =0 ;i<ans.length;i++) {
                answer+=ans[i]+' ';
            }
            his.push(answer);
            return;
        }
        for(let i = 0; i < set.length; i++) {
            ans[index] = set[i];
            build(index+1);
        }
    }
}
