sentence = input()
sentence = sentence.strip()
slength = sentence.split(" ")
count = 0
for i in range(len(slength)) :
    if slength[i] != '' :
        count+=1
    else : 
        continue
print(count)