total = 0

for i in range(7):
    i = float(input())

    if(i >= 8):
        total += 1

if(total >= 5):
    print("Desempenho otimo")
elif(total >= 3):
    print("Desempenho razoavel")
else:
    print("Desempenho ruim")