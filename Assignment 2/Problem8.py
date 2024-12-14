import random
from array import array


# O(N^2)
def countOnesAndZeros(A):
    n = len(A)
    l = []
    ans = 0
    for i in range(n):
        for j in range(n-1):
            row = 0
            if A[i][j] == 1 and A[i][j+1] == 0:
                row = row + 1
        i=i+2
        l.append(row)
    ans = l.index(max(l))    
    return ans


# O(N)
def countOnesAndZerosOptimized(A):
    n = len(A)
    l = []
    ans = 0
    row = 0
    j = 0
    for i in range(n):
        if A[i][j] == 1 and A[i][j+1] == 0:
            row = row + 1
        l.append(row)
    ans = l.index(max(l))
    return ans



n = int(input("Enter value of N: "))
A = [[random.randint(0,1) for i in range(n)] for j in range(n)]
print("Matrix A: ",A)

print("Most no of 1's after 0 in the rows of A are: ",countOnesAndZeros(A))
# print("Most no of 1's after 0 in the rows of A are: ",countOnesAndZerosOptimized(A))


# # Test Cases
# a = [[1, 0, 1, 0, 1, 1], [1, 0, 0, 1, 0, 0], [1, 0, 0, 1, 0, 0], [0, 0, 0, 1, 1, 0], [0, 1, 0, 0, 0, 0], [1, 0, 1, 1, 0, 1]]
# print("Most no of 1's after 0 in the rows of A are: ",countOnesAndZeros(a))
# print("Most no of 1's after 0 in the rows of A are: ",countOnesAndZerosOptimized(a))
