# Prototype

O Prototype é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.


## Problema:

Como criar um objeto novo aproveitando o estado previamente existe em outro objeto, e evitar aguns problemas como:

- Criação de projetos complexos
- Redução de duplicação de código
- Performance
- Desacoplamento
- Memória

## Solução:

O padrão Prototype delega o processo de clonagem para o próprio objeto que está sendo clonado. O padrão declara um interface comum para todos os objetos que suportam clonagem. Essa interface permite que você clone um objeto sem acoplar seu código à classe daquele objeto. No Java já existe o método `clone()`

A implementação do método `clone()` é muito parecida em todas as classes. O método cria um objeto da classe atual e carrega todos os valores de campo para do antigo objeto para o novo, pode até mesmo copiar campos privados porque a maioria das linguagens de programação permite objetos acessar campos privados de outros objetos que pertençam a mesma classe.

Um objeto que suporta clonagem é chamado de um protótipo. Quando seus objetos têm dúzias de campos e centenas de possíveis configurações, cloná-los pode servir como uma alternativa à subclasses. Cria-se um conjunto de objetos, configurados de diversas formas. Quando você precisa um objeto parecido com o que você configurou, apenas clona um protótipo ao invés de construir um novo objeto a partir do nada.

## Implementação básica

- Cria interface `Prototype` declara os métodos de clonagem. Na maioria dos casos é apenas um método clonar como no Java.

- A classe `Prototype` Concreta implementa o método de clonagem. Além de copiar os dados do objeto original para o clone, esse método também pode lidar com alguns casos específicos do processo de clonagem relacionados a clonar objetos ligados, desfazendo dependências recursivas, etc.

- A classe `Client` pode produzir uma cópia de qualquer objeto que segue a implemetação do método `clone()`.
