import math

a = float(input('Insira o valor da Constante A: '))
b = float(input('Insira o Valor da Constante B: '))
c = float(input('Insira o valor da constante C: '))
delta = b**2-4*a*c
resposta1 = (-b + math.sqrt(delta))/2*a
resposta2 = (-b - math.sqrt(delta))/2*a
print (resposta1)
print (resposta2)