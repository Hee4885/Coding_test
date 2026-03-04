T = int(input())

for _ in range(T) :
	s = input()
	print(s[len(s)-len(s)]+s[len(s)-1])