# Bloco 1 - Generation Brasil

Reorganização dos exercícios antigos de Java do Bloco 1.

O objetivo deste repositório é guardar a evolução dos estudos de lógica de programação e orientação a objetos, deixando os arquivos mais fáceis de navegar, compilar e revisar.

## Estrutura

```text
Bloco1-GEN-main/
├── src/
│   ├── JAVA_INTRO/       # Entrada, saída, cálculos e operadores
│   ├── Java_LacosDEC/    # Estruturas condicionais
│   ├── Java_LacosRep/    # Estruturas de repetição
│   ├── Arrays/           # Vetores e matrizes
│   ├── POO/              # Classes, atributos, métodos e objetos
│   └── POO_2/            # Herança, polimorfismo e collections
└── docs/
    └── EXERCICIOS.md     # Índice comentado dos exercícios
```

## Como compilar

Na raiz do projeto, execute:

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem -Recurse src -Filter *.java).FullName
```

O Java vai gerar os arquivos compilados dentro da pasta `out/`.

## Como executar

Depois de compilar, execute a classe desejada usando o nome do pacote:

```powershell
java -cp out JAVA_INTRO.Exercicio1
java -cp out Java_LacosDEC.LacosDec_exerc_1
java -cp out Java_LacosRep.LacosRep_exFor_1
java -cp out Arrays.Array_ex1
java -cp out POO.TesteCliente
java -cp out POO_2.ex3Collections
```

## Observações

- A lógica original dos exercícios foi preservada.
- A organização foi ajustada para seguir os `package` declarados nos arquivos.
- Os arquivos `Array_exc1.java` e `Array_exc3.java` foram renomeados para `Array_ex1.java` e `Array_ex3.java`, pois classes públicas em Java precisam ter o mesmo nome do arquivo.
