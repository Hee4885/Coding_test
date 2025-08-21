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
# remove는 앞에서 부터 요소를 삭제하면 인덱스가 삭제된 인덱스 이후부터 실행되므로 한 인덱스씩 밀린다.
    return len(arr)

