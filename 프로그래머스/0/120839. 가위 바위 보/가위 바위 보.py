def solution(rsp):
    answer = list(rsp)
    temp = ""
    for ch in answer :
        if ch == "2" :
            temp += "0"
        elif ch == "5" :
            temp += "2"
        elif ch == "0" :
            temp += "5"
    answer = temp

    return answer