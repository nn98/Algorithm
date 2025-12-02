export {};

const fs = require("fs");
const filePath =
    process.platform === "linux" ? "/dev/stdin" : __dirname + "/input.txt";
const [_, ...arr] = fs
    .readFileSync(filePath)
    .toString()
    .trim()
    .split("\n")
    .map(BigInt);

for (const x of arr) {
    let isPrime = true;
    for (let i = 2n; i <= 1000000n; i++) {
        if (x % i === 0n) {
            console.log("NO");
            isPrime = false;
            break;
        }
    }
    if (isPrime) console.log("YES");
}
