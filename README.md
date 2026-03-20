<div align="center">

<pre>
   ██╗ █████╗ ██╗   ██╗ █████╗     ██████╗ ██╗   ██╗██████╗ ███████╗
   ██║██╔══██╗██║   ██║██╔══██╗    ██╔══██╗██║   ██║██╔══██╗██╔════╝
   ██║███████║██║   ██║███████║    ██████╔╝██║   ██║██████╔╝█████╗  
██ ██║██╔══██║╚██╗ ██╔╝██╔══██║    ██╔═══╝ ██║   ██║██╔══██╗██╔══╝  
╚████╔╝██║  ██║ ╚████╔╝ ██║  ██║    ██║     ╚██████╔╝██║  ██║███████╗
 ╚═══╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝    ╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝
 
   ░░░  B A R E   M E T A L   E N G I N E E R I N G  ░░░
</pre>

<br/>

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" width="90"/>

<br/><br/>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![JDK 25](https://img.shields.io/badge/JDK_25-000000?style=for-the-badge&logo=openjdk&logoColor=ED8B00)](https://openjdk.org/)
[![POO](https://img.shields.io/badge/Paradigma-POO-1a1a2e?style=for-the-badge)](https://en.wikipedia.org/wiki/Object-oriented_programming)
[![Status](https://img.shields.io/badge/Status-Em_Construção-brightgreen?style=for-the-badge)](#)

<br/>

> *"Before you can build castles, you must understand the stone."*

</div>

---

## ⚡ O Manifesto

Frameworks são atalhos. Atalhos sem mapa levam a becos sem saída.

Este repositório **não usa Spring. Não usa Hibernate. Não usa magia.**

Cada linha aqui é escrita com intenção. Cada classe, cada método, cada laço de repetição — tudo orquestrado à mão, com plena consciência do que a JVM está fazendo por baixo dos panos. Isso não é orgulho de academismo; é **fundação de engenharia**.

```java
public class Filosofia {
    public static void main(String[] args) {
        var princípio = "Domine a fundação. Os frameworks vêm de graça depois.";
        System.out.printf(">> %s%n", princípio);
    }
}
// OUTPUT: >> Domine a fundação. Os frameworks vêm de graça depois.
```

---

## 🧠 Pilares Técnicos

### 🔷 Orientação a Objetos de Verdade

Não POO de tutorial. POO de sistema real.

| Conceito | O que é praticado aqui |
|---|---|
| **Encapsulamento** | Estado protegido via modificadores. Sem `setters` que violam invariantes de negócio |
| **Composição** | Entidades que *contêm* outras entidades — `Pedido` contendo `List<Item>` |
| **Polimorfismo** | `@Override` em `toString()`, `equals()` e comportamentos de domínio |
| **Abstração** | Separação limpa entre *o que o sistema faz* e *como ele faz* |

### 🔷 Memória e Performance

A JVM não é uma caixa preta. Aqui, ela é um livro aberto.

```
Stack  ──────►  Primitivos & Referências locais
                 int x = 42;  /  String ref → Heap

Heap   ──────►  Objetos instanciados via `new`
                 new Produto("Café", 9.99)

GC     ──────►  Coleta objetos sem mais referências ativas
                 (controlamos isso ao gerir o escopo)
```

- `StringBuilder` em laços → evita explosão de objetos `String` imutáveis no Heap
- `ArrayList<T>` com tipo genérico → segurança em compile-time, sem `ClassCastException` em runtime
- Scanner com flush de buffer → controle real de fluxo de I/O

### 🔷 Fluxo e Lógica

- Estruturas condicionais complexas e laços aninhados com propósito
- Algoritmos de busca manual por ID em coleções — o que o `JPA` faz, feito à mão
- Formatação de saída com `printf` e `String.format` — saídas dignas de sistemas reais

---

## 📂 Estrutura do Laboratório

```
src/
└── application/
    ├── Program26.java   ──  Composição: entidade Autor contendo Livro
    ├── Program27.java   ──  Listas dinâmicas + StringBuilder
    ├── Program28.java   ──  Agregação, médias e tamanho de coleções
    └── ...              ──  novos desafios sendo adicionados
```

> Cada `Program` é um problema de engenharia resolvido do zero. Sem scaffolding. Sem atalho.

---

## 🗺️ Roadmap

```
 ✅  Composição de objetos e encapsulamento
 ✅  Listas dinâmicas com ArrayList e StringBuilder
 ✅  Cálculos de agregação e média em coleções

 🔲  Busca binária implementada manualmente em listas de objetos
 🔲  Manipulação de arquivos — File, BufferedWriter, FileReader
 🔲  Exceções customizadas para regras de negócio
 🔲  Interfaces e inversão de dependência
 🔲  Streams & Lambdas — a ponte entre o bare metal e o moderno
 🔲  Estruturas de dados: pilhas, filas e árvores from scratch
```

---

## 🔬 Por que isso importa?

Frameworks como Spring e Hibernate são engenharia de primeira linha — construídos por décadas de experiência coletiva. Mas frameworks **não ensinam engenharia**. Eles escondem a engenharia.

Quem entende o `bare metal`:

- **Debugga mais rápido** — sabe onde olhar quando o framework mente
- **Arquiteta melhor** — entende trade-offs reais de memória e acoplamento  
- **Aprende frameworks em dias** — porque entende o problema que eles resolvem

> *"If you can't explain it simply, you don't understand it well enough."* — Einstein

---

## 🛠️ Como Executar

**Pré-requisitos:** JDK 25+

```bash
# Compilar um programa específico
javac src/application/Program26.java

# Executar
java -cp src application.Program26
```

Ou abra direto no **IntelliJ IDEA** / **VS Code** com o plugin Java Extension Pack.

---

<div align="center">

**─────────────────────────────────────**

Desenvolvido com ☕ e obsessão por fundamentos

*"Engenharia de Software é a arte de construir o invisível com precisão cirúrgica."*

**─────────────────────────────────────**

![Visitor Count](https://komarev.com/ghpvc/?username=seu-usuario&color=ED8B00&style=flat-square&label=visitas)

</div>
