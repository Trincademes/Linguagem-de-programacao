![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 02: variáveis e operadores lógicos/aritméticos 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é dominar a manipulação de variáveis e operadores lógicos e aritméticos exercitando o raciocínio lógico para a criação de algoritmos.  

Variáveis em linguagens de programação são espaços na memória que armazenam valores que podem ser manipulados durante a execução do programa, permitindo a criação de algoritmos dinâmicos e flexíveis. Operadores aritméticos, como soma (+), subtração (-), multiplicação (*) e divisão (/), realizam cálculos matemáticos essenciais para o processamento de dados. Já os operadores lógicos, como AND, OR e NOT, possibilitam a tomada de decisões ao avaliar expressões booleanas, controlando o fluxo do programa. A combinação desses elementos é fundamental para a construção de algoritmos eficientes e funcionais.

Para mais informações acesse [Aula 03: Fluxogramas.](https://cainaantunes.notion.site/Aula-03-Vari-veis-189bde521b3b8092a2dfdfef9190b15e?pvs=4)

***

1. Ler um número inteiro e exibir o seu dobro.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        double num2 = num1 * 2;
        
        System.out.println("O resultado de " + num1 + " multiplicado por 2 é: " + num2);

        scanner.close();
    }
}
```

2. Ler um número inteiro e exibir o seu quadrado.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();

        double resultado = Math.pow(base, expoente);
        System.out.println(base + " elevado a " + expoente + " = " + resultado);

        scanner.close();
    }
}

```
3. Ler um número real e exibir a quinta parte deste número.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();
        
        double num2 = num1 / 5;
        System.out.println("A quinta parte de " + num1 + " é = " + num2);

        scanner.close();
    }
}

```
4. Ler duas notas N1 e N2 e exibir a média.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double num2 = scanner.nextDouble();

        double med = (num1 + num2) / 2;
        System.out.println("A média das notas " + num1 + " e " + num2 + " é = " + med);

        scanner.close();
    }
}

```
5. Ler uma velocidade em $Km/h$ e converter para $m/s$.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em km/h: ");
        double km = scanner.nextDouble();

        double conver = km / 3.6;
        System.out.println("A velocidade de " + km + " km/h, convertido em m/s é " + conver);

        scanner.close();
    }
}

```
6. Ler uma velocidade em $m/s$ e converter para $km/h$.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");
        double ms = scanner.nextDouble();

        double conver = ms * 3.6;
        System.out.println("A velocidade de " + ms + " m/s, convertido em km/h é " + conver);

        scanner.close();
    }
}

```
7. Ler uma medida em milímetro e converter para polegadas.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor em mm: ");
        double mm1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor em mm: ");
        double mm2 = scanner.nextDouble();

        double media = (mm1 + mm2) / 2;
        double pole = media * 0.03937;
        System.out.println("A média de " + mm1 + " mm e " + mm2 + " mm é = " + media + " mm, que transformado em polegadas é = " + pole);

        scanner.close();
    }
}

```
8. Ler uma medida em polegadas e converter para milímetros.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor em polegadas: ");
        double pole1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor em polegadas: ");
        double pole2 = scanner.nextDouble();

        double media = (pole1 + pole2) / 2;
        double mm = media / 0.03937;
        System.out.println("A média de " + pole1 + " polegadas e " + pole2 + " polegadas é = " + media + " polegadas, que transformado em milímetros é = " + mm);

        scanner.close();
    }
}

```
9. Ler uma medida de distância em quilômetros e converter 
para milhas.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor em km/h: ");
        double km1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor em km/h: ");
        double km2 = scanner.nextDouble();

        double media = (km1 + km2) / 2;
        double milhas = media * 0.621371;
        System.out.println("A média de velocidade de " + km1 + " km/h e " + km2 + " km/h é = " + media + " km/h, que convertido em milhas é = " + milhas);

        scanner.close();
    }
}

```
10. Ler uma medida de distância em milhas e converter para quilômetros.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor em milhas: ");
        double mi1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor em milhas: ");
        double mi2 = scanner.nextDouble();

        double media = (mi1 + mi2) / 2;
        double km = media / 0.621371;
        System.out.println("A média de velocidade de " + mi1 + " milhas e " + mi2 + " milhas é = " + media + " milhas, que convertido em quilômetros é = " + km);

        scanner.close();
    }
}

```
11. Entrar com o valor de temperatura em graus Celsius e exibir a temperaturacorrespondente em graus Fahrenheit.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double cel = scanner.nextDouble();
        double fa = (cel* 9/5) + 32;
        System.out.println(cel + "°C equivale a " + fa+ "°F");
    }
}

```
12. Ler duas notas N1 e N2 e exibir a média. 

      >Obs.: N1 tem peso 1 e N2 tem peso 2 e resultadodeve estar entre 0 e 10.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota  ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota  ");
        double n2 = scanner.nextDouble();

        double n2p2 = n2*2;

        double media = ( n1+n2p2)/2;
        System.out.println(" A média é "+media);
    }
}

```
13. Receber o raio e um círculo e calcular sua área.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do circulo   ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo com raio " + raio + " é: " + area);
    }
}

```
14. Receber a base e a altura de um triângulo retângulo e calcular sua área.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do triangulo  ");
        double altura = scanner.nextDouble();
        System.out.print("Digite a basa do tringulo    ");
        double base = scanner.nextDouble();
         double area = (base * altura)/2;
        System.out.println("A área do trinagulo com base " + base + " e altura de " +altura+ "é = " + area);
    }
}

```
15. Receber o raio e a altura de um cilindro e calcular seu volume.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do cilindro  ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a basa do cilindro    ");
        double altura = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) *altura ;

        System.out.println("O volume do cilindro com raio " + raio + " e altura de " +altura+ "é = " + volume);
    }
}


```
16. Receber o raio e a altura de um cone e calcular seu volume.
```java
mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do cone  ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a basa do cone   ");
        double altura = scanner.nextDouble();

        double volume = (1 / 3) * Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume do cone com raio " + raio + " e altura de " +altura+ "é = " + volume);
    }
}

```
17. Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade inicial  ");
        double vinicial = scanner.nextDouble();

        System.out.print("Digite a acelereção   ");
        double ace = scanner.nextDouble();

        System.out.print("Digite o tempo    ");
        double tempo  = scanner.nextDouble();

        double vfinal =(vinicial + ace * tempo);

        System.out.println("A velocidade final é "+vfinal);
    }
}

```
18. Receber os coeficientes $a$ e $b$ de uma equação do primeiro grau e imprimir a solução.

      >Equação do primeiro grau: $ax + b = 0$
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a valor de A  ");
        double a = scanner.nextDouble();

        System.out.print("Digite o v alor de B   ");
        double b = scanner.nextDouble();
if (a !=0){
    double x = -b / a;
    System.out.println("A solução da equação " + a + "x + " + b + " = 0 é: x = " + x);
} else {
        // Se a for zero, verifica se b também é zero
        if (b == 0) {
            System.out.println("A equação tem infinitas soluções.");
        } else {
            System.out.println("A equação não tem solução.");
        }
    }

```
19. Receber os coeficientes $a$, $b$ e $c$ de uma equação do segundo grau e imprimir a solução.

      >Equação do segundo grau: $ax^2 + bx + c = 0$
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        
        if (delta > 0) {
           
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes reais são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A raiz real é: x = " + x);
        } else {
            System.out.println("Não existem raízes reais.");
        }
        
        scanner.close();
    }
}

```
20. Descobrir uma equação do segundo grau a partir de suas raízes:

      >Exemplo: <br>
      $x1 = 1$ e $x2 = 2$ <br>
      Então: <br>
      $(x -1) . (x -2)$ <br>
      Logo: <br>
      $x2 -3x -2 = 0$ <br>

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de x1 (primeira raiz): ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Digite o valor de x2 (segunda raiz): ");
        double x2 = scanner.nextDouble();
        
        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;
        
        System.out.println("A equação do segundo grau é:");
        System.out.printf("x^2 %+.2fx %+.2f = 0\n", b, c);
        
        scanner.close();
    }
}


```