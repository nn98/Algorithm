class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self):
        self.root = None

    def insert(self, data):
        if self.root is None:
            self.root = Node(data)
            return

        cur = self.root
        before = cur
        while cur:
            before = cur
            if cur.data > data:
                cur = cur.left
            else:
                cur = cur.right

        cur = Node(data)
        if before.data > data:
            before.left = cur
        else:
            before.right = cur

def input_data():
    n, k = map(int, input().split())
    trees = []
    for _ in range(n):
        tree = BinaryTree()
        values = list(map(int, input().split()))
        for value in values:
            tree.insert(value)
        trees.append(tree)
    return n, k, trees

def child(a):
    t = 0
    if a.left:
        t |= 1 << 1
    if a.right:
        t |= 1 << 2
    return t

def same_shape(a, b):
    return child(a) == child(b)

def is_same(a, b):
    flag = same_shape(a, b)
    if flag:
        if a.left:
            flag = flag and is_same(a.left, b.left)
        if a.right:
            flag = flag and is_same(a.right, b.right)
    return flag

def solve():
    n, _, trees = input_data()

    color = [-1] * n
    visit = [0] * n

    for i in range(n):
        if color[i] > -1:
            continue
        color[i] = i
        for j in range(i + 1, n):
            if color[j] > -1:
                continue
            if is_same(trees[i].root, trees[j].root):
                color[j] = i

    res = 0
    for i in range(n):
        visit[color[i]] = 1

    for i in range(n):
        res += visit[i]

    print(res)

if __name__ == "__main__":
    solve()
