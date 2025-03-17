# Estruturas de Dados em Java 🖥️

Este projeto implementa estruturas de dados básicas em Java, incluindo listas e pilhas. Ele permite armazenar, manipular e exibir números inteiros e strings de forma estruturada.

## 📌 Funcionalidades
- **Lista de Números Inteiros** 📊  
  - Adicionar números à lista  
  - Remover números por posição  
  - Exibir a lista de números  

- **Lista de Strings** 📝  
  - Adicionar nomes à lista  
  - Remover nomes por posição  
  - Exibir a lista de nomes  

- **Pilha de Números Inteiros** 🔢  
  - Empilhar números  
  - Desempilhar o topo da pilha  
  - Exibir o elemento no topo  
  - Mostrar toda a pilha  

## 🚀 Como usar
### Lista de Números Inteiros
```java
ListaArray lista = new ListaArray(5);
lista.adicionar(10);
lista.adicionar(20);
lista.adicionar(30);
lista.imprimirLista();
lista.remover(1);
lista.imprimirLista();
```
### Lista de Strings
```java
ListaArrayString lista = new ListaArrayString(4);
lista.adicionar("Ana");
lista.adicionar("Bruno");
lista.adicionar("Carlos");
lista.imprimirLista();
lista.remover(1);
lista.imprimirLista();

```
### Pilha de Números Inteiros
```java
Pilha pilha = new Pilha(5);
pilha.push(10);
pilha.push(20);
pilha.push(30);
pilha.imprimirPilha();
System.out.println("Topo da pilha: " + pilha.peek());
System.out.println("Removendo: " + pilha.pop());
pilha.imprimirPilha();

```

## 📜 Exemplo de Saída
```yaml
Lista: 10 20 30  
Lista: 10 30  

Lista de Nomes: Ana Bruno Carlos  
Lista de Nomes: Ana Carlos  

Pilha: 10 20 30  
Topo da pilha: 30  
Removendo: 30  
Pilha: 10 20  

```

## 📖 Licença
MIT
