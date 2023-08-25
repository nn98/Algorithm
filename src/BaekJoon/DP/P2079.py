def is_palindrome(left_idx, right_idx, s):
    while left_idx <= right_idx:
        if s[left_idx] != s[right_idx]:
            return False
        left_idx += 1
        right_idx -= 1
    return True

s = input()
N = len(s)
dp = [2001] * (N + 1)
dp[0] = 0

for i in range(N):
    for j in range(i + 1):
        if is_palindrome(j, i, s):
            dp[i + 1] = min(dp[i + 1], dp[j] + 1)
        else:
            dp[i + 1] = min(dp[i + 1], dp[i] + 1)

print(dp[N])
