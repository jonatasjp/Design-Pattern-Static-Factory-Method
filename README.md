# Repositório da implementação do padrão de Projeto Static Factory Method

Este repositório contém a implementação do padrão de Projeto Static Factory Method, foi desenvolvido em Java e utilizando a técnica de Desenvolvimento de software TDD.

Este padrão é ideal para evitar os problemas clássicos ao se utilizar um construtor, dentre eles podemos destacar os seguintes:

1. Dois construtores não podem ter parâmetros do mesmo tipo.

2. Um construtor sempre cria um novo objeto. (Não é obrigatório que a implementação do Static Factory Method retorne sempre a mesma instância, mas usando esse padrão é possível aliar ao singleton e não criar novas instâncias).

3. Um construtor só pode retornar objetos da mesma classe, talves esse seja o principal problema do uso de construtores, e com o Static Factory Method esse problema é resolvido.
