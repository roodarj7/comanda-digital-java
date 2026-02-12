# Sistema de Comanda Digital (Java)

Um projeto prático desenvolvido para aplicar os conceitos fundamentais da **Programação Orientada a Objetos (POO)** em Java. O sistema simula o lançamento de pedidos em um restaurante, diferenciando Pratos de Bebidas e calculando o total da conta automaticamente.

## Funcionalidades

* **Cadastro de Itens:** Criação de pratos (com descrição) e bebidas (com tamanho em ml).
* **Gestão de Pedidos:** Adição dinâmica de itens a um pedido vinculado a uma mesa.
* **Cálculo Automático:** Soma o valor total de todos os itens consumidos.
* **Nota Fiscal:** Exibe o detalhamento do pedido e o valor final.

## Estrutura do Código

O projeto foi estruturado utilizando os seguintes conceitos:

* **Abstração (`abstract class`):**
  * Classe `ItemCardapio`: Serve de modelo base (com nome e preço), impedindo a criação de itens genéricos.
* **Herança (`extends`):**
  * Classes `Prato` e `Bebida`: Herdam de `ItemCardapio` e adicionam características específicas (descrição para pratos, tamanho para bebidas).
* **Polimorfismo (`@Override`):**
  * Método `imprimirDetalhes()`: Cada item exibe suas informações de forma personalizada na nota fiscal.
* **Coleções (`ArrayList`):**
  * Uso de listas dinâmicas na classe `Pedido` para armazenar uma quantidade indefinida de itens.
* **Encapsulamento:**
  * Uso de atributos `private` e métodos `Getters/Setters` para proteger os dados.

## Exemplo de Uso

```java
// Criando um pedido para a Mesa 10
Pedido pedido = new Pedido(10);

// Adicionando itens variados (Polimorfismo em ação)
pedido.adicionarItem(new Bebida("Coca-Cola", 8.50, 350));
pedido.adicionarItem(new Prato("Filé a Parmegiana", 45.00, "Acompanha fritas"));

// Gerando a nota fiscal
pedido.imprimirNotaFiscal();
