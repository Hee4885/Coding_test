def solution(emergency):
    answer = []
    num = 0
    reverse_arr = sorted(emergency,reverse=True)
    # reverse는 반복자를 반환해 주기 때문에 리스트로 변환해주어야 한다.
    # 또는 sorted를 한 후 reversed를 True로 준다.
    for i in range(len(emergency)) :
        for j in range(len(reverse_arr)) :
            if emergency[i] == reverse_arr[j] :
                num = j+1
                break
        answer.append(num)
        
    return answer