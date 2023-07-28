<details><summary>P14725</summary>

2023-01-17
- <u>***Data Structure***</u>
- String 
- Tree 
- Trie  
~~~
단순 자료구조 문제
다진 트리 구조. 주어진 문제 그대로 다진 트리를 구현해도 맞고
트라이 자료구조를 사용해도 맞다.

정직한 중첩 딕셔너리로 구현했다. 파이썬 응애답게.
묘수풀이해보겠답시고 튜플(먹이,깊이) 딕셔너리로 풀다가 출력초과.
이유는 딕셔너리 속 튜플의 중복을 확인하지 못해
A > B > C               A > B > C
      > D               A > B > D
 ⬆ 이게                   ⬆ 이래돼서.
~~~
[오늘의 선생님](https://velog.io/@kimdukbae/BOJ-14725-%EA%B0%9C%EB%AF%B8%EA%B5%B4-Python)  
❗ 구조는 동일한데 문법이 신기하다
~~~python
def f(c,d):
 for e in sorted(c):print('--'*d+e);f(c[e],d+1)
t={}
for e in[*open(0)][1:]:
 h=t
 for c in e.split()[1:]:h=h.setdefault(c,{})
f(t,0)
~~~
>이모티콘 박아가며 풀이 작성하니 웃기네
</details>

<details><summary>P17398</summary>

2023-07-27
- <u>***Data Structure***</u>
- Union find
[오늘의 선생님](https://atgane.tistory.com/72)  
</details>

