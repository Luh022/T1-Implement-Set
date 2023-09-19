                                        T1 - Implementação do tipo de dado abstrato Set

    Para implementar um conjunto (set) como um tipo de dado abstrato, podemos utilizar duas estruturas de dados comumente eficientes para essa finalidade: hash set e 
    árvore binária de busca. Vamos abordar cada uma delas e justificar sua escolha, além de discutir a complexidade de tempo e espaço para cada operação.
    -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    HashSet usando Tabela de Hash:
    Justificativa: A tabela de hash (ou hash table) permite acesso, inserção e remoção de elementos em tempo médio constante (O(1)) em cenários ideais, 
    desde que a função de hash seja eficaz e a tabela não esteja muito cheia. É uma escolha popular para conjuntos devido a sua eficiência para operações básicas.
    Complexidade de Tempo:
    Inserção (add): O(1) amortizado (tempo constante em média, considerando uma boa função de hash e baixa carga).
    Remoção (remove): O(1) amortizado.
    Busca (contains): O(1) amortizado.
    Complexidade de Espaço: O(n) no pior caso, onde n é o número de elementos no conjunto.
    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    Árvore Binária de Busca (BST):
    Justificativa: Uma árvore binária de busca mantém os elementos ordenados, o que facilita operações como busca e remoção. 
    Embora a busca seja um pouco mais lenta em comparação com a tabela de hash, 
    a estrutura é útil se a ordem dos elementos é importante ou se é necessário iterar sobre os elementos na ordem.
    Complexidade de Tempo:
    Inserção (add): O(log n) no caso médio, O(n) no pior caso (árvore degenerada).
    Remoção (remove): O(log n) no caso médio, O(n) no pior caso.
    Busca (contains): O(log n) no caso médio, O(n) no pior caso (árvore degenerada).
    Complexidade de Espaço: O(n), onde n é o número de elementos no conjunto.

