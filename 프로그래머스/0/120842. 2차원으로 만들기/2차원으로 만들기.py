def solution(num_list, n):
    #(1)for 문으로 요소를 2개씩 가져오고 그걸 리스트화 시키고, 그 리스트를 answer리스트에 추가
    answer = []
    
    while len(num_list)>0 :
        arr = [] #누적을 막기 위한 새 배열 생성
        for i in range(n) :
            arr.append(num_list.pop())
        arr.reverse()
        answer.append(arr)
    
    answer.reverse()
    return answer