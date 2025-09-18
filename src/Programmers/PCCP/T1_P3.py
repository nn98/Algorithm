def solution(points, routes):
    answer = 0
    def move(start, end, count):
        nonlocal answer
        # print('start', start)
        # print('end', end)
        # print('from %d, %d / to %d, %d', %(start[0], start[1], end[0], end[1]))
        for i in irange(start[0],end[0]):
            if count in matrix[i][start[1]]:
                answer += 1
            else:
                matrix[i][start[1]].append(count)
            count+=1
        for j in irange(start[1],end[1]):
            if count in matrix[end[0]][j]:
                answer += 1
            else:
                matrix[end[0]][j].append(count)
            count+=1
        return count
    size = max(map(max, points))
    matrix = [[[] for _ in range(size)] for _ in range(size)]
    # print(points[routes[0][0]-1])
    # print(points[routes[0][1]-1])
    # move(points[routes[0][0]-1], points[routes[0][1]-1])
    for route in routes:
        for i in range(1,len(route)):
            count = 1
            count = move(route[i-1], route[i], count)

    print('\n'.join(map(str, matrix)))
    return answer
def irange(a, b):
    step = 1 if a <= b else -1
    return range(a+1, b + step, step)