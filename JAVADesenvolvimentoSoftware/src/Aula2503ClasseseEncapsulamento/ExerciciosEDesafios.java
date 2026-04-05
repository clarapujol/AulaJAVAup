package Aula2503ClasseseEncapsulamento;
/* Exercícios e Desafios - Encapsulamento e Organização de Funções



## **Exercício 1: Sistema de Cadastro de Funcionários**

        ### **Objetivo:**

Criar um sistema que permite cadastrar funcionários, armazenando nome, cargo e salário. Os funcionários devem ser armazenados em um array e exibidos ao final do cadastro.


### **Requisitos:**

        1. Criar a classe `Funcionario` com:

        - Atributos `nome` (String), `cargo` (String) e `salario` (double).

        - Construtor para inicializar os atributos.

  - Métodos `getters` e um metodo `exibirInfo()` para exibir os detalhes do funcionário.



2. Criar a classe `CadastroFuncionarios` com:

        - Um array de `Funcionario` para armazenar até 5 funcionários.

  - Um loop para cadastrar funcionários utilizando um `InputHelper`.

        - Exibir todos os funcionários cadastrados ao final.

        ### **Exemplo de Execução Esperada:**


Digite o nome do funcionário: João

Digite o cargo do funcionário: Gerente

Digite o salário do funcionário: 5000.00



Digite o nome do funcionário: Ana

Digite o cargo do funcionário: Desenvolvedor

Digite o salário do funcionário: 4500.00



Lista de Funcionários:

Nome: João - Cargo: Gerente - Salário: R$ 5000.00

Nome: Ana - Cargo: Desenvolvedor - Salário: R$ 4500.00

        ## **Desafio: Sistema de Controle de Pedidos**


        ### **Objetivo:**

Criar um sistema de controle de pedidos para um restaurante, onde o usuário pode cadastrar pedidos e visualizar a lista de pedidos realizados.



        ### **Requisitos:**

        1. Criar a classe `Pedido` com:

        - Atributos `descricao` (String), `quantidade` (int) e `precoUnitario` (double).

        - Um metodo `calcularTotal()` que retorna `quantidade * precoUnitario`.

        - Um metodo `exibirInfo()` que mostra os detalhes do pedido e o valor total.



2. Criar a classe `GerenciadorPedidos` com:

        - Um array de `Pedido` para armazenar até 5 pedidos.

  - Um loop para permitir o cadastro dos pedidos utilizando `InputHelper`.

        - Exibir todos os pedidos cadastrados com o valor total de cada um.


        ### **Exemplo de Execução Esperada:**


Digite a descrição do pedido: Pizza

Digite a quantidade: 2

Digite o preço unitário: 30.00



Digite a descrição do pedido: Refrigerante

Digite a quantidade: 3

Digite o preço unitário: 5.00



Lista de Pedidos:

Pedido: Pizza - Quantidade: 2 - Total: R$ 60.00

Pedido: Refrigerante - Quantidade: 3 - Total: R$ 15.00 */


