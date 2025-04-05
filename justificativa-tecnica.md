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

A implementação apresentada resolve corretamente o problema proposto, utilizando a estrutura de dados Set conforme exigido e gerando todos os subconjuntos possíveis com clareza e precisão. A lógica foi construída de forma a preservar a ordenação dos elementos usando TreeSet, além de aplicar manipulação de bits para eficiência na geração das combinações. A escolha por abstrair a lógica em um método separado (gerarSubconjuntos) reflete boas práticas de modularização, facilitando manutenção e testes.

