import random
dinheiro = 100


for num in range(10):
    roletada = random.randint(1,100)
    print("número roletado ", roletada)
    if roletada < 50: dinheiro = dinheiro-30
    else: dinheiro = dinheiro+15
    print("Dinheiro: ", dinheiro)

if(dinheiro < 0): print("It's over pro betinha")

