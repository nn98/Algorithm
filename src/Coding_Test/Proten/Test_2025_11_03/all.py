import json
import math
import statistics

with open('student_data.json', 'r', encoding='utf-8') as f:
    data = json.load(f)

print('이름 학과 학번 국어 영어 수학 평균')

for student in data['학생_점수_테이블']:
    name = student['이름']
    department = student['학과']
    student_number = student['학번']
    korean = student['국어']
    english = student['영어']
    mathematics = student['수학']
    average = statistics.mean([korean, english, mathematics])
    # 예시와 동일하게 하기 위해 소숫점 1자리에서 절삭
    average = math.floor(average * 10) / 10

    print(f"{name} {department} {student_number} {korean} {english} {mathematics} {average:.1f}")
