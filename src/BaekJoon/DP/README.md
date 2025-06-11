## DP

* * *

> ### [2515](https://www.acmicpc.net/problem/2515) - 전시장
>#### DP 구현
>> 정렬 / DP / 이분탐색 삼위일체<br /><br />
> `정렬`<br />
> 보일 수 있는 조건은 높이, 오름차순<br />
> 선택 조건은 가치, 내림차순<br />
> `DP`<br />
> 인덱스 i에서 현재높이 - S 이상인 가장 오른쪽 값 탐색<br />
> `이분(이진) 탐색`<br />
> bisect.bisect_right(heights, target(height - S)) -1<br />
> 그 값이 있으면 dp에 합, 없으면 그냥 자기값만<br />
> 로컬/전역 최적값 추적용 dp/max_dp 두 배열 사용

> ### [2038](https://www.acmicpc.net/problem/2038) - 골롱 수열
>#### 점화식 지옥
>> 문제를 잘못알아들어서 [1, 2, 2, 3, 3, 3, 4 ...] 인줄<br />
>> - 배열(수열) arr에서, 숫자 n 에 있어<br />
>> - n이 arr[n] 의 값만큼 존재<br />
>> - arr은 단조증가 수열
>>   - n값이 증가함에 따라 arr[n]값이 감소하지 않는 수열
>>   - == arr[n] >= arr[n-?] (? >= 0)<br />
>> 
>> 올바른 배열은 [1, 2, 3, 3, 4, 4, 4 ,5 ...]<br />
> 점화식은 dp[i] = 1 + dp[i - dp[dp[i - 1]]]<br />
> ...

> ### <a href = "https://www.acmicpc.net/problem/1949"> <img src="https://static.solved.ac/tier_small/14.svg" width="30" height="20">1949 : 우수 마을</a> / [`코드1`](https://github.com/nn98/Algorithm/blob/main/src/BaekJoon/DP/P1949.py) / [`코드2(풀이)`](https://github.com/nn98/Algorithm/blob/main/src/BaekJoon/DP/P1949_2.py)
> #### `Tree` / `DP in Tree`
> `트리의 구조와 특성 활용하기`
>> - 조건 중 
>>   - 우수 - 우수 인접 불가
>>   - 일반은 적어도 하나의 우수와 인접
>>   - 가능한 경우의 수는 우수 - 일반 / (우수) - 일반 - 일반 - (우수)
>>   - EX) [마을1]:1000 - [마을2]:10 - [마을3]:20- [마을2]:1000 이면 1000 + 0 + 0 + 1000.
>> - 해당 경우의 수를 DP 배열로 표현할 방법을 고민했는데 <br>표현이 난해할 뿐 일반-일반이면 인구수를 포함 안하는거니까 걍 둘다 스킵 == 전전 인덱스의 인구수 참조
>> - DP[현재 마을][일반] = MAX(DP[이전 마을][우수], DP[전전 마을][일반])
>> - DP[현재 마을][우수] = DP[이전 마을][일반] + 현재 마을 인구수
>> - 리프 노드까지 가서 역순으로 돌아오는 후위 연산 - DFS 필요
>> - 오랜만에 DFS하니 힘드렁