# Verificador de Intervalo

Este é um programa Java simples que solicita ao usuário que digite um número entre 0 e 100 e, em seguida, informa em qual intervalo o número se enquadra. Ele utiliza a biblioteca Swing para exibir janelas de diálogo para interação com o usuário.

## Descrição

O programa pede ao usuário para inserir um valor numérico. Após a entrada, o programa verifica em qual dos seguintes intervalos o número se encontra:

* \[0-25]
* (25-50]
* (50-100]
* Fora do intervalo (se o número for menor que 0 ou maior que 100)

O resultado da verificação é exibido em uma janela de diálogo.

## Como Executar

Para executar este código, você precisará ter o Java Development Kit (JDK) instalado em seu sistema. Siga os passos abaixo:

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. Certifique-se de que a estrutura de pastas seja `principal/Main.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até a pasta onde você salvou o arquivo `principal` e execute o seguinte comando para compilar o código:

    ```bash
    javac principal/Main.java
    ```

    Isso criará um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o seguinte comando:

    ```bash
    java principal.Main
    ```

    Uma janela de diálogo aparecerá solicitando a entrada de um valor.

## Como Usar

1.  Ao executar o programa, uma janela de diálogo será exibida com a mensagem "Digite um valor de 0-100:".
2.  Digite um número inteiro entre 0 e 100 (ou fora desse intervalo para testar a última condição) e clique em "OK".
3.  Outra janela de diálogo será exibida, informando o intervalo em que o número digitado se enquadra.
4.  O programa será encerrado após exibir a mensagem.

## Explicação do Código

* `package principal;`: Declara o pacote ao qual a classe `Main` pertence.
* `import javax.swing.*;`: Importa a biblioteca Swing, que fornece classes para criar interfaces gráficas, como janelas de diálogo.
* `public class Main { ... }`: Define a classe principal do programa.
* `public static void main(String[] args) { ... }`: O método principal onde a execução do programa começa.
* `JOptionPane.showInputDialog(...)`: Exibe uma janela de diálogo para obter a entrada do usuário (o número a ser verificado).
* `Integer.parseInt(...)`: Converte a entrada do usuário (que é uma String) para um número inteiro e armazena na variável `a`.
* `if (a <= 25) { ... }`: Verifica se o valor de `a` é menor ou igual a 25. Se verdadeiro, exibe a mensagem "Intervalo \[0-25]".
* `else if (a <= 50) { ... }`: Se a condição anterior for falsa, verifica se o valor de `a` é menor ou igual a 50. Se verdadeiro, exibe a mensagem "Intervalo \[25-50]". Note que implicitamente, `a` é maior que 25 neste ponto.
* `else if (a <= 100) { ... }`: Se as condições anteriores forem falsas, verifica se o valor de `a` é menor ou igual a 100. Se verdadeiro, exibe a mensagem "Intervalo \[50-100]". Implicitamente, `a` é maior que 50 neste ponto.
* `else { ... }`: Se nenhuma das condições anteriores for verdadeira (ou seja, `a` é menor que 0 ou maior que 100), exibe a mensagem "Fora do intervalo".
* `JOptionPane.showMessageDialog(...)`: Exibe uma janela de diálogo com uma mensagem para o usuário, indicando o intervalo do número ou que ele está fora do intervalo.
