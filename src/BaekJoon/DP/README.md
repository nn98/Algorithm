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
