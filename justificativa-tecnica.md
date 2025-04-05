# Justificativa Técnica – Geração de Subconjuntos em Java

**Nome:** Arthur Silva Ferreira  
**Curso:** Sistemas de Informação – 6º Período  
**Vaga:** Estágio em Desenvolvimento / Prova Técnica Encora  

---

## 🎯 Objetivo

Desenvolver a função `getSubSets(Set A)` que retorna todos os subconjuntos de um conjunto A, conforme especificado, utilizando a interface `Set` e respeitando a ordem de saída demonstrada no exemplo da questão.

---

## 🔍 Estratégia Adotada

- Utilização de `bitmasking` para gerar todos os subconjuntos possíveis de forma eficiente e controlada.
- Conversão do `Set` em uma `List` para garantir ordenação dos elementos.
- Utilização de `LinkedHashSet` para manter a ordem de inserção dos elementos nos subconjuntos.
- Armazenamento dos subconjuntos em uma `List<Set<Integer>>` para permitir ordenação posterior conforme critérios solicitados.

---

## ⚙️ Critérios de Ordenação

Os subconjuntos são ordenados:
1. Por **tamanho decrescente** (subconjuntos maiores vêm antes).
2. Em caso de empate, pela **ordem crescente dos valores** dos elementos.

---

## ✅ Estruturas Utilizadas

- `Set`, `List`, `LinkedHashSet`, `ArrayList`
- `Collections.sort` com `Comparator` personalizado
- `Bitmask` para geração de combinações (2ⁿ subconjuntos)

---

## 🧠 Conclusão

A solução apresentada está de acordo com os requisitos do problema, respeitando a estrutura de dados exigida (`Set`) e a ordem de saída conforme exemplo. Além disso, demonstra domínio de lógica de programação, estruturas de dados e clareza na codificação — habilidades esperadas de um candidato do 5º período para uma vaga de estágio técnico.


