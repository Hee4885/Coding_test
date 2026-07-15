def solution(str_list, ex):
    # filter(조건 함수, 반복 가능한 객체)
    # 익명 함수 : lambda
    answer = filter(lambda s: not (ex in s), str_list)
    return "".join(answer)