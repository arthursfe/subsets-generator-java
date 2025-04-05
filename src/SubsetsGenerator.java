import java.util.*;

public class SubsetsGenerator {

    // Função para gerar todos os subconjuntos de um conjunto A
    public static List<Set<Integer>> getSubSets(Set<Integer> A) {
        List<Integer> list = new ArrayList<>(A); // transforma o Set em lista ordenada
        Collections.sort(list);

        int n = list.size();
        List<Set<Integer>> allSubsets = new ArrayList<>();

        // Gera todos os subconjuntos usando bitmask
        for (int mask = 0; mask < (1 << n); mask++) {
            Set<Integer> subset = new LinkedHashSet<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(list.get(i));
                }
            }
            allSubsets.add(subset);
        }

        // Ordena os subconjuntos: por tamanho decrescente, depois pelos valores
        allSubsets.sort((a, b) -> {
            if (b.size() != a.size()) {
                return b.size() - a.size(); // ordem decrescente de tamanho
            } else {
                Iterator<Integer> itA = a.iterator();
                Iterator<Integer> itB = b.iterator();
                while (itA.hasNext() && itB.hasNext()) {
                    int valA = itA.next();
                    int valB = itB.next();
                    if (valA != valB) {
                        return valA - valB;
                    }
                }
                return 0;
            }
        });

        return allSubsets;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Set<Integer> conjunto = new HashSet<>(Arrays.asList(1, 2, 3));
        List<Set<Integer>> subconjuntos = getSubSets(conjunto);

        // Exibe os subconjuntos
        for (Set<Integer> s : subconjuntos) {
            System.out.println(s);
        }
    }
}

