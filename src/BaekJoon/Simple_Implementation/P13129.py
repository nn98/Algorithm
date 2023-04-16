const fs = require('fs');
function main() {
    let [A, B, N] = fs.readFileSync('/dev/stdin').toString().split(' ').map(x => +x),
        output = [];
    for (let i = 1; i <= N; i++) {
        output.push(A * N + B * i);
    }
    console.log(...output);
}
main();
