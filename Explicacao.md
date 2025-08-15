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
    
    
2.Annalyn

Neste exercício, o objetivo é implementar uma lógica para um jogo de RPG em que o personaem principal é a Annalyn.
No RPG tem algumas ações que os personagens podem ou não executar, ele nos da algumas situações que vamos resolver com operedores booleanos.

2.1 Verificar se pode efetuar um ataque rápido
Para saber se era possível efetuar o ataque, precisavamos saber se o cavaleiro estava acordado ou não.
Para isso temos o método "canFastAttack(boolean knightIsAwake)" com o parâmetro do cavaleiro como um booleano, abaixo definimos a variável
"boolean canFastAttack =! knightIsAwake" o operador "=!" compara se são diferentes, então se "knightIsAwake" for "true" o método "canFastAttack" vai ser "false".
Dando um "return canFastAttack" resolvendo a primeira task do RPG.

2.2 Verificar se o grupo pode ser espionado
Para saber se o grupo pode ser espionado temos três booleanos, assim como no primeiro se estão acordados ou não. O método retorna true se
o grupo pode ser espionado. Então no método "canSpy" passamos todos os booleanos "canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake)".
Para o método retornar verdadeiro basta um dos personagens estarem acordados, então podemos definir a variável "boolean canSpy = knightIsAwake || archerIsAwake || prisonerIsAwake"
o operador "||" é representado como "OR"(OU), então se um dos personagens retornar "true" o método retorna "true", resolvendo a segunda ação do RPG.




