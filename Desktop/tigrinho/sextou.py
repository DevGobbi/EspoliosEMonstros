import random

diadasemana = random.randint(0,6)
diadasemananome = ""

if diadasemana == 0: diadasemananome = "Domingo"
if diadasemana == 1: diadasemananome = "Segunda"
if diadasemana == 2: diadasemananome = "Terça"
if diadasemana == 3: diadasemananome = "Quarta"
if diadasemana == 4: diadasemananome = "Quinta"
if diadasemana == 5: diadasemananome = "Sexta"
if diadasemana == 6: diadasemananome = "Sábado"

if diadasemana == 5:
    print(diadasemananome)
    print ('Sextou')
else:
    print(diadasemananome)
    print ('Its over pro betinha')