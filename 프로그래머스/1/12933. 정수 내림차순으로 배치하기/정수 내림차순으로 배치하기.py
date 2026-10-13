def solution(n):
    n_list = "".join(sorted(list(str(n)),reverse=True))
    return int(n_list)