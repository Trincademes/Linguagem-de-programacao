![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input1[\ Digite sua Nota \]
    input1 --> input2[\ Digite sua Frequência \]
    input2 --> verification1{ Nota >= 50? }
    verification1 --> |Sim| verification2{ Frequência >= 75%? }
    verification2 --> |Sim| A[/ Aprovado /]
    verification2 --> |Não| B[/ Reprovado /]
    verification1 --> |Não| B
    A --> finish([ Fim ])
    B --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input1[\ Digite o Primeiro Número \]
    input1 --> input2[\ Digite o Segundo Número \]
    input2 --> sum[ Soma = Primeiro Número + Segundo Número ]
    sum --> output[/ Exiba a Soma /]
    output --> finish([ Fim ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input[\ Digite um Número \]
    input --> verification{ Número >= 0? }
    verification --> |Sim| A[/ Positivo /]
    verification --> |Não| B[/ Negativo /]
    A --> finish([ Fim ])
    B --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input[\ Digite a Idade \]
    input --> verification{ Idade >= 18? }
    verification --> |Sim| A[/ Pode Votar /]
    verification --> |Não| B[/ Não Pode Votar /]
    A --> finish([ Fim ])
    B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input1[\ Digite o Primeiro Número \]
    input1 --> input2[\ Digite o Segundo Número \]
    input2 --> verification{ Primeiro Número > Segundo Número? }
    verification --> |Sim| A[/ Primeiro Número é Maior /]
    verification --> |Não| B[/ Segundo Número é Maior /]
    A --> finish([ Fim ])
    B --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input1[\ Digite o Primeiro Número \]
    input1 --> input2[\ Digite o Segundo Número \]
    input2 --> input3[\ Digite o Terceiro Número \]
    input3 --> verification1{ Primeiro Número > Segundo Número? }
    verification1 --> |Sim| verification2{ Primeiro Número > Terceiro Número? }
    verification1 --> |Não| verification3{ Segundo Número > Terceiro Número? }
    verification2 --> |Sim| A[/ Primeiro Número é Maior /]
    verification2 --> |Não| B[/ Terceiro Número é Maior /]
    verification3 --> |Sim| C[/ Segundo Número é Maior /]
    verification3 --> |Não| B
    A --> finish([ Fim ])
    B --> finish
    C --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input[\ Digite um Número \]
    input --> verification{ Número >= 0? }
    verification --> |Sim| init[ Fatorial = 1 ]
    verification --> |Não| error[/ Erro: Número Negativo /]
    init --> loop{ Número > 1? }
    loop --> |Sim| fatorial[ Fatorial = Fatorial * Número ]
    loop --> |Não| output[/ Exiba o Fatorial /]
    fatorial --> decrement[ Número = Número - 1 ]
    decrement --> loop
    output --> finish([ Fim ])
    error --> finish
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input[\ Digite um Número \]
    input --> verification{ Número % 2 == 0? }
    verification --> |Sim| A[/ É Par /]
    verification --> |Não| B[/ É Ímpar /]
    A --> finish([ Fim ])
    B --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
    start(( Início )) --> input[\ Digite um Número \]
    input --> verification1{ Número <= 1? }
    verification1 --> |Sim| A[/ Não é Primo /]
    verification1 --> |Não| init[ Divisor = 2 ]
    init --> loop{ Divisor < Número? }
    loop --> |Sim| verification2{ Número % Divisor == 0? }
    verification2 --> |Sim| B[/ Não é Primo /]
    verification2 --> |Não| increment[ Divisor = Divisor + 1 ]
    increment --> loop
    loop --> |Não| C[/ É Primo /]
    A --> finish([ Fim ])
    B --> finish
    C --> finish
   ```