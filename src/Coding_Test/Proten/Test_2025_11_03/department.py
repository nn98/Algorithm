import json
import math
import statistics

with open('student_data.json', 'r', encoding='utf-8') as f:
    data = json.load(f)

departments = {}

for student in data['학생_점수_테이블']:
    department = student['학과']
    korean = student['국어']
    english = student['영어']
    mathematics = student['수학']

    total_score = korean + english + mathematics

    if department not in departments:
        departments[department] = {'count': 0, 'total_sum': 0}

    departments[department]['count'] += 1
    departments[department]['total_sum'] += total_score

for department, data_info in departments.items():
    dept_average = data_info['total_sum'] / (data_info['count'] * 3)
    dept_average = math.floor(dept_average * 10) / 10
    # 출력 양식과 같게
    avg_str = str(dept_average).rstrip('0').rstrip('.')
    print(f"{department} {avg_str}")
