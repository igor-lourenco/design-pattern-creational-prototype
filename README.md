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

O padrão Prototype delega o processo de clonagem para o próprio objeto que está sendo clonado. O padrão declara um interface comum para todos os objetos que suportam clonagem. Essa interface permite que você clone um objeto sem acoplar seu código à classe daquele objeto. No Java já existe o método clone()
