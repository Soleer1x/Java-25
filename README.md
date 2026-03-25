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

### 🔷 Orientação a Objetos de Verdade

Não POO de tutorial. POO de sistema real.

| Conceito | O que é praticado aqui |
|---|---|
| **Encapsulamento** | Estado protegido via modificadores. Sem `setters` que violam invariantes de negócio |
| **Composição** | Entidades que *contêm* outras entidades — `Pedido` contendo `List<Item>` |
| **Polimorfismo** | `@Override` em `toString()`, `equals()` e comportamentos de domínio |
| **Abstração** | Separação limpa entre *o que o sistema faz* e *como ele faz* |

---

## 📂 Estrutura do Laboratório

```
src/
├── application/
│   ├── Program26.java   
│   ├── Program27.java   
│   ├── Program28.java
│   └── ...
└── entitys/
    │  entitys/enums
    │  └── enum.java
    ├── entity1.java
    ├── entity2.java
    ├── entity3.java
    └── ...
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

## 🛠️ Como Executar

**Pré-requisitos:** JDK 25+

```bash
# Compilar um programa específico
javac src/application/Program26.java

# Executar
java -cp src application.Program26
```

Ou abra direto no **IntelliJ IDEA** / **Eclips** com o plugin Java Extension Pack.

---

<div align="center">

**─────────────────────────────────────**

Desenvolvido com ☕ e obsessão por fundamentos

*"Engenharia de Software é a arte de construir o invisível com precisão cirúrgica."*

**─────────────────────────────────────**

![Visitor Count](https://komarev.com/ghpvc/?username=seu-usuario&color=ED8B00&style=flat-square&label=visitas)

</div>
