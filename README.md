# 📚 Subsets Generator in Java

Este repositório contém uma solução em Java para a geração de todos os subconjuntos possíveis de um conjunto de inteiros, com ordenação por tamanho decrescente e, em caso de empate, por ordem crescente dos elementos.

---

## 🚀 Objetivo

Desenvolver a função `getSubSets(Set A)` conforme solicitado em prova técnica para vaga de estágio. A função utiliza estruturas da interface `Set` e retorna uma lista contendo todos os subconjuntos possíveis de um conjunto A.

---

## 🧠 Lógica da Solução

1. O conjunto `A` é convertido para uma `List` para permitir acesso indexado e ordenação.
2. Subconjuntos são gerados utilizando **bitmasking** (representação binária de todas as combinações).
3. Os subconjuntos são armazenados em uma `List<Set<Integer>>` para facilitar a ordenação.
4. A lista de subconjuntos é ordenada de acordo com os seguintes critérios:
   - **Tamanho decrescente** do subconjunto.
   - **Ordem crescente** dos elementos.

---

## 📦 Tecnologias Utilizadas

- Java 8+
- `Set`, `List`, `LinkedHashSet`, `ArrayList`
- Lógica com **bitmask** para gerar subconjuntos
- Comparadores personalizados para ordenação

---

## 📁 Estrutura do Projeto


