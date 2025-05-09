# Exercícios Aula 1

## Exercícios em C++

1. **Programa em C/C++ que:**
   - Popula um vetor com _n_ números inteiros aleatórios (entre 0 e 500);
   - Exibe o vetor com os _n_ números armazenados;
   - Insere no `vetorPar` os números pares e no `vetorImpar` os números ímpares;
   - Exibe o `vetorPar`;
   - Exibe o `vetorImpar`.

2. **Programa em C/C++ que:**
   - Gere _n_ números aleatórios;
   - Armazene os números, um abaixo do outro, em um arquivo chamado `dados.txt`.

3. **Programa em C/C++ que:**
   - Leia o arquivo `dados.txt` contendo números inteiros (um por linha);
   - Armazene esses números em um vetor, ignorando os números duplicados.

---

# Exercícios Aula 2

1. **Programa em Java baseado no código anterior (lista de Integer) que:**
   - Receba, via teclado, _n_ nomes de pessoas;
   - **Requisitos:**
     - Não poderá haver nomes duplicados;
     - Ao final do cadastro, a lista deverá ser ordenada;
     - O programa deverá permitir que o usuário digite um nome para pesquisa e, se encontrado, exclua esse nome da lista;
     - Exiba novamente a lista.

1.1. **Programa em Java baseado no código anterior (lista de Integer) que:**
   - Descobrir a diferença em Java de Vector, ArrayList e LinkedList. Construir exemplos.

---

# Exercícios Aula 4

## Exercício: Listas de Disciplinas e Contagem de Alunos

### Objetivo:
Criar listas representando as disciplinas do curso de Ciência da Computação, associar alunos a essas disciplinas e contar quantas disciplinas cada aluno cursa.

### Disciplinas e Alunos:
- **Projeto Banco de Dados**: Andrisa, Matheus
- **Estruturas de Dados**: Andrisa, Matheus
- **Comunicação de Dados**: Andrisa

### Implementação:
- Criar _n_ listas representando as disciplinas do curso de Ciência da Computação.
- Para cada lista, adicionar os alunos correspondentes.
- Criar uma lista principal `cienciaComputacao` que armazene todas as listas de disciplinas.
- Exibir o nome de cada aluno e a quantidade de disciplinas em que está matriculado.


# Exercícios Aula 5

## Exercício: Geração de Emails

Este projeto tem como objetivo receber nomes completos de pessoas, validar se o nome foi digitado corretamente (ou seja, contém pelo menos duas palavras) e, a partir disso, gerar um email para cada pessoa. O email é formado combinando o primeiro nome com o último nome, separados por ponto, seguido de `@ufn.edu.br` (por exemplo, "João Pedro Garcia" gera o email `joao.garcia@ufn.edu.br`).

Após a geração do email, o par (nome completo e email) é adicionado a uma lista, garantindo que não haja emails duplicados. O projeto exibe, ao final, a lista com os dados cadastrados.

## Funcionalidades

- **Validação do Nome Completo:**  
  O programa verifica se o nome informado contém ao menos duas palavras, garantindo que o usuário digite seu nome completo.

- **Geração do Email:**  
  Converte o nome para letras minúsculas, remove acentos e utiliza o primeiro e o último nome para formar o email no padrão:  
  `primeiroNome.ultimoNome@ufn.edu.br`

- **Controle de Duplicidade:**  
  Utiliza uma estrutura (como um HashSet) para evitar que sejam cadastrados emails repetidos.

- **Armazenamento dos Dados:**  
  Cada par (nome completo e email) é armazenado em um objeto da classe `Pessoa` e adicionado a uma lista.

- **Exibição dos Dados:**  
  Ao final, o programa imprime a lista com o nome completo e o email de cada pessoa cadastrada.
 
 
# Exercícios Aula 6

## Exercício: Cadastro de Alunos com Verificação de Email

Este projeto tem como objetivo cadastrar alunos com nome completo e número de matrícula, gerando automaticamente um e-mail institucional no formato `primeironome.ultimonome@ufn.edu.br`. O sistema impede cadastros duplicados com base no e-mail gerado e, ao final, exibe a lista de alunos ordenada por nome.

## Funcionalidades

- **Geração Automática de Email:**  
  A partir do nome completo informado, o sistema extrai o primeiro e o último nome (em letras minúsculas) e monta o e-mail no padrão:  
  `primeironome.ultimonome@ufn.edu.br`

- **Controle de Duplicidade via Email:**  
  O sistema não permite o cadastro de alunos com e-mails já existentes. A verificação de duplicidade é feita através da sobrescrita dos métodos `equals` e `hashCode` na classe `Aluno`.

- **Sobrescrita de Métodos (@Override):**
  - `equals(Object o)`: Verifica se dois alunos possuem o mesmo e-mail.
  - `hashCode()`: Permite o uso correto da classe em coleções baseadas em hash.
  - `toString()`: Exibe as informações do aluno de forma legível (matrícula, nome e email).

- **Armazenamento dos Dados:**  
  Cada aluno é armazenado em uma lista dinâmica (`ArrayList`), com matrícula gerada automaticamente.

- **Ordenação Alfabética:**  
  Ao final, os alunos são exibidos em ordem alfabética com base no nome.


# Exercícios Aula 7

## Exercício: pontos em um plano cartesiano

04/04/2025 - AVALIAÇÃO
Fazer um programa que trage pontos em um plano cartesiano (x,y). 
Os pontos devem estar armazenados em um arquivo texto, um ponto abaixo do outro, em que x e y estão separados por ';'. 
O programa deve ler o arquivo e popular seus dados em uma lista encadeada dinamicamente. 
O usuário por sua vez, deve ser capaz de exibir esses dados e procurar por um ponto em especial.

# Exercícios Aula 8

## Exercício: Estruturas Dinâmicas em Java (Queue, Stack e HashSet)

Este projeto tem como objetivo praticar a manipulação de filas, pilhas e tabelas hash em Java, trabalhando com inserção, remoção e controle de duplicidade de objetos.

## Funcionalidades

- **Simulação de Atendimento com Fila (Queue):**  
  Utiliza duas filas (`filaUrgente` e `filaNormal`).  
  A cada sorteio de número:
  - `0`: Remove um processo da fila urgente.
  - `100`: Remove um processo da fila normal.
  - `1` a `99`: Insere novo processo na fila urgente, caso ainda não exista.
  - `101` a `199`: Insere novo processo na fila normal, caso ainda não exista.  
  Ao final, exibe os processos não atendidos.

- **Gerenciamento de Processos com Pilha (Stack):**  
  Utiliza duas pilhas (`pilhaInteiros` e `pilhaProcessos`).  
  Realiza operações de:
  - Inserção (`push()`);
  - Remoção (`pop()`);
  - Visualização do topo da pilha (`peek()`, comentado no código).  
  Ao final, exibe os processos restantes na pilha.

- **Cadastro de Peças com Tabela Hash (HashSet):**  
  Utiliza uma tabela hash para armazenar peças (`HashSet<Peca>`).  
  - Cada peça é identificada pelo seu código único.
  - Não permite a inserção de peças duplicadas (código já existente).
  - Exibe todas as peças cadastradas junto com seus códigos de hash.
