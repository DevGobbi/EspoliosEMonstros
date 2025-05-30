distanciapercorrida = float(input('Insira a distância total percorrida pelo objeto em quilômetros!'))
tempototal = float(input('Insira o tempo total em que o objeto se locomoveu em horas!'))
velocidademedia = distanciapercorrida/tempototal
velocidadefinal= (velocidademedia/3.6)
print (f'Sua velocidade em quilômetros por hora é equivalente a {velocidademedia}km/h!') 
print (f'Portanto, ao converter o valor da velocidade média pra metros por segundos, você recebe o valor final de {velocidadefinal:.2f} metros por segundo!')