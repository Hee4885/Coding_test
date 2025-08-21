def solution(n):
    arr = []
    count = 0
    for i in range(1,n+1) :
        for j in range(1,i+1) :
            if i%j == 0 :
                count += 1
        arr.append(count)
        count = 0
    for k in arr[::-1] :
        if k < 3 :
            arr.remove(k)
    return len(arr)

