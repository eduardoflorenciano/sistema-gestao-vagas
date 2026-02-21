# Sistema de Gestão de Vagas

Projeto desenvolvido como exercício prático de **Java**, aplicando conceitos fundamentais de **Lógica de Programação** e **Programação Orientada a Objetos (POO)**.

---

## Sobre o Projeto

Aplicação de terminal que gerencia a ocupação de **5 vagas** de um estacionamento em tempo real. O usuário interage via menu para listar vagas, registrar entradas e saídas de veículos.

---

## Conceitos Aplicados

- **Encapsulamento**: atributos privados acessados apenas via getters e setters
- **ArrayList**: lista dinâmica para armazenar os objetos de vaga
- **Laços de repetição**: `while` para o menu e `for` para percorrer a lista
- **Sobrescrita de método**: `toString()` para formatar a exibição das vagas
- **Validação de estado**: regras para impedir ações inválidas

---

## Estrutura do Projeto

```
sistema-gestao-vagas/
├── Vaga.java         # Classe modelo da vaga (atributos, getters, setters, toString)
└── Principal.java    # Classe principal com o menu e toda a lógica de interação
```

---

## Funcionalidades

| Opção | Descrição |
|-------|-----------|
| 1 | Listar todas as vagas com status e placa |
| 2 | Registrar entrada de veículo em uma vaga livre |
| 3 | Registrar saída de veículo e liberar a vaga |
| 4 | Encerrar o sistema |

---

## Validações

- Não é possível ocupar uma vaga que já está **ocupada**
- Não é possível liberar uma vaga que já está **livre**
- Número de vaga inválido exibe mensagem de erro
