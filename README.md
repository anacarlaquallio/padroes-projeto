# 💻 Padrões de Projeto
Este repositório contém um trabalho da disciplina de Engenharia de Software (BCC3004 - UTFPR Campus Campo Mourão), que consiste em uma prática envolvendo padrões de projeto.

Padrões de projeto descrevem objetos e classes que se relacionam para resolver um problema de projeto genérico em um contexto particular. Cada padrão descreve um problema que sempre ocorre em nosso contexto e uma solução para ele, de forma que possamos usá-la um milhão de vezes.

Nesse sentido, os padrões de projeto podem ser classificados como:

- **Criacionais**: padrões que propõem soluções flexíveis para criação de objetos.
- **Estruturais**: padrões que propõem soluções flexíveis para composição de classes e objetos.
- **Comportamentais**: padrões que propõem soluções flexíveis para interação e divisão de responsabilidades entre classes e objetos.

Para este trabalho, foram escolhidos 3 padrões de cada categoria, a saber: *Builder (padrão criacional)*; *Decorator (estrutural)* e *Observer (comportamental)*. Além disso, para cada um, foram desenvolvidos exemplos de código na linguagem de programação Java. Vejamos os padrões escolhidos.

## 📝 Builder (crioacional)
### Propósito
O padrão de projeto *Builder* é uma técnica que permite a construção de objetos complexos passo a passo. Uma analogia pode ser feita: assim como a construção de uma casa, onde cada etapa é executada gradualmente - desde o projeto arquitetural, passando pela preparação do terreno, estrutura, até as paredes, telhado e acabamentos - o *Builder* nos permite construir objetos de forma incremental, controlando cada aspecto do processo.

### Problema
Imagine um objeto complexo que necessite de uma inicialização passo a passo de muitos campos e objetos. É preciso de um construtor monstruoso com vários parâmetros, aumentando o acoplamento do código (métrica CBO).

### Solução
O padrão *Builder* sugere a exttração do código de construção do objeto para fora de sua própria classe e mova ele para objetos separados chamados *builders*. Estruturalmente, temos o *diretor*, que define a ordem na qual executar as etapas de construção, e o *builder*, que provê a implementação dessas etapas.

### Exemplo
Para o exemplo, considere o contexto da construção de um objeto `Star`, com atributos como nome, luminosidade, temperatura e massa. Com o padrão de projeto *Builder*, podemos separar a construção de uma estrela em passos individuais e fornecer métodos para configurar cada atributo separadamente. Nesse sentido, temos as classes:
    - `Star`: Representa a estrela que queremos construir, com atributos como nome, luminosidade, temperatura e massa;
    - `StarBuilder`: Define a interface para a construção de uma estrela. Contém métodos para definir os atributos.
    - `StarBuilderImpl`: Implementa a interface StarBuilder. Responsável por construir a estrela, fornecendo métodos para configurar os atributos da estrela;
    - `StarDirector`: Coordena o processo de construção da estrela. Recebe um StarBuilder e utiliza-o para construir uma estrela conforme uma sequência de passos;
    - `Main`: Contém o código de exemplo para demonstrar como usar o padrão de projeto *Builder* para construir uma estrela.

O código de exemplo encontra-se [https://github.com/anacarlaquallio/padroes-projeto/tree/main/builder](https://github.com/anacarlaquallio/principios-solid/blob/main/inversaoDependencia/correto/Main.java) e a figura abaixo mostra o diagrama UML das classes descritas anteriormente.
![Diagrama UML - Builder](image.png)

## 📝 Decorator (estrutural)


## 📝 Observer (comportamental)


### 📚 Bibliografia

Marco Tulio Valente. Engenharia de Software Moderna: Princípios e Práticas para Desenvolvimento de Software com Produtividade, Editora: Independente, 2020.

Refactoring Guru. Padrões de Projeto. Disponível em: https://refactoring.guru/pt-br/design-patterns. Acesso em: 12 maio 2024.