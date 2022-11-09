n,u=int(input()),0
for i in range(n):
    for j in list(map(int,input().split())):
        u+=j
print(u)