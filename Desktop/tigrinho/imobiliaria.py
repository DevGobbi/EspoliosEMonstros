nome = input('Insira o nome do corretor: ')
qvendas = float(input('Insira a quantidade de vendas feitas pelo consultor: '))
vtvendas = float(input('Insira o valor total das propriedades vendidas: '))
salario = (qvendas*200+vtvendas*0.05)+1500
print (f'O corretor {nome} teve um salário total de R${salario}.')