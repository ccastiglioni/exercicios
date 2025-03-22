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


# Exercícios UFN - Aula 5: Geração de Emails

## Descrição

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
 



