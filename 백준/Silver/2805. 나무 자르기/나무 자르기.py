import sys
input = sys.stdin.readline

n, m = map(int, input().split())
woods = list(map(int, input().split()))

left, right = 0, max(woods)

while left <= right:
    mid = (left + right) // 2
    total = sum((wood - mid) for wood in woods if wood > mid)
    
    if total >= m:
        left = mid + 1
    else:
        right = mid - 1

print(right)