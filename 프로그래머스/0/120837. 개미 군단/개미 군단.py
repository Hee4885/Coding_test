def solution(hp):
    count = 0
    while hp > 0 :
        if hp>=5 :
            hp -= 5
            count += 1
        elif hp >= 3 :
            hp -= 3
            count += 1
        else :
            hp -= 1
            count += 1
    return count