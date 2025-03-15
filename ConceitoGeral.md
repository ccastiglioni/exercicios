# Estruturas de Dados - Conceitos e Técnicas

## 1️⃣ Estruturas Lineares (Listas, Pilhas e Filas)

### Listas Dinâmicas:
- **ArrayList** (baseado em array dinâmico)
- **LinkedList** (baseado em nós encadeados)

### Pilhas (Stacks):
- **LIFO (Last In, First Out)**
- Implementação: **Stack em Java** ou pilha manual com **LinkedList**

### Filas (Queues):
- **FIFO (First In, First Out)**
- Implementação: **Queue em Java** ou com **LinkedList**

### Filas Duplamente Encadeadas (Deque):
- Permite inserção e remoção nos dois extremos.

### Filas de Prioridade:
- O elemento com maior prioridade sai primeiro (exemplo: **PriorityQueue** em Java).

---

## 2️⃣ Estruturas Hierárquicas (Árvores)

### Árvores Binárias de Busca (BST - Binary Search Tree):
- Cada nó tem no máximo dois filhos.
- Busca eficiente em **O(log n)**.

### Árvores Balanceadas:
- **AVL Tree** (autobalanceamento por rotação)
- **Red-Black Tree** (utilizada em **TreeMap** e **TreeSet** do Java)

### Árvore B e B+ (usadas em bancos de dados):
- Armazena muitos valores por nó para minimizar acessos ao disco.

### Heap (Min Heap e Max Heap):
- Base para **Filas de Prioridade**.

---

## 3️⃣ Estruturas Não Lineares (Grafos)

### Grafos (Graph):
- Estruturas que representam redes, como mapas e redes sociais.
- Implementação com **listas de adjacência** ou **matriz de adjacência**.

### Algoritmos de Grafos:
- **Busca em Profundidade (DFS)** e **Busca em Largura (BFS)**
- **Dijkstra** (menor caminho)
- **Floyd-Warshall** e **Bellman-Ford** (menores caminhos em grafos ponderados)

---

## 4️⃣ Tabelas Hash e Dicionários

### HashMap (Java) / Unordered Map (C++):
- Utiliza **funções hash** para busca rápida **O(1)**.

### HashSet:
- Conjunto sem elementos duplicados, com busca eficiente.

### Implementação manual de Tabela Hash:
- Com **técnicas de tratamento de colisões** como **encadeamento separado** ou **sondagem linear**.

---

## 5️⃣ Técnicas e Algoritmos Relacionados

### Ordenação:
- Bubble Sort, Selection Sort, Insertion Sort (simples)
- Merge Sort, Quick Sort, Heap Sort (eficientes)

### Recursão e Divisão e Conquista:
- Conceito fundamental para **árvores** e **algoritmos de ordenação**.

### Programação Dinâmica:
- **Memorização e otimizadores de tempo de execução**.

### Backtracking:
- Algoritmos para resolver **sudoku**, **labirintos**, etc.

### Algoritmos Gulosos:
- Estratégia para resolver problemas de otimização.

---

## 🔥 Para o futuro: Ponteiros e Alocação Dinâmica

Quando você estudar **ponteiros** em C/C++, verá conceitos como:
✅ **Ponteiros Simples**  
✅ **Ponteiros para Ponteiros**  
✅ **Ponteiros para Função**  
✅ **Ponteiros para Estruturas (Structs)**  
✅ **Alocação Dinâmica (malloc, calloc, free)**  

Isso ajudará muito quando for implementar **listas encadeadas, árvores e grafos** em C/C++.

---

## 🔹 O que estudar primeiro depois do que já viu?
📌 **Se você já viu ArrayList, LinkedList e Dicionários**, um bom próximo passo seria:
   - **Filas e Pilhas**
   - **Árvores Binárias**
   - **Tabelas Hash**

Essas são algumas das estruturas fundamentais que você verá no curso de **Estruturas de Dados**. 🚀

