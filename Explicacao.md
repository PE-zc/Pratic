Projeto criado para trabalhar a lógica e os fundamentos da linguagem

1.Lasanha

Neste problema, ele pede que escrevamos um código para ajudar a cozinhar uma lasanha, e nos passa 4 tasks para resolver.
Um exercicio básico para trabalhar com os operadores lógicos, métodos e parâmetros, usando o Java

1.1 Definir o tempo de cozimento no forno.
Para resolver este problema defini o método passado como "expectedMinutesInOven()" e definindo a variável "minutes" com o valor "40"

1.2 Calcular o tempo em que a lasanha esta no forno.
Resolvendo a segunda task que faz referência a primeira, resolvi passando o método "remainingMinutesInOven(int minutes)" com a variável "minutes" como parâmetro
definindo a outra variável "minutesRemain" com o valor "10". Para chegar ao resultado do tempo de forno basta dar um "return minutes - minutesRemain".

1.3 Calcular o tempo de preparo
Nesta terceira task resolvi passando o método "preparationTimeInMinutes(int layers)" com "layers" como parâmetro.
No problema é passado que cada camada leva 2 minutos para ser preparada, então defini a variável "prepare" com o valor "2" e dando um "return layers * prepare"
para retornar o numero de camadas vezes o tempo de preparo.

1.4 O tempo total do preparo da lasanha
A quarta e última task temos o método passado como "totalTimeInMinutes(int layers, int minutes)"
Passado os parâmetros no método, basta dar um "return layers * 2 + minutes" para retornar o tempo total baseado nas camadas e o tempo de forno.
    
    
