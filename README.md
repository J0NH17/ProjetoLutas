# 🥊 Simulador de Lutas UFC
 
Este projeto é um simulador simples de lutas inspirado no UFC, desenvolvido com o objetivo de praticar lógica de programação e conceitos de orientação a objetos.
 
## 📌 Descrição
 
O sistema permite:
 
- Selecionar um **lutador** e um **desafiante**
- Exibir as **informações detalhadas** de cada lutador
- Validar se ambos pertencem à **mesma categoria de peso**
- Simular o resultado da luta de forma **aleatória**
 
Caso os lutadores sejam de categorias diferentes, a luta **não é permitida**.
 
---
 
## ⚙️ Funcionalidades
 
### 👤 Cadastro de Lutadores
Cada lutador possui atributos como:
- Nome
- Nacionalidade
- Idade
- Altura
- Peso
- Categoria (leve, médio, pesado, etc.)
- Número de vitórias, derrotas e empates
 
---
 
### ⚖️ Validação de Categoria
Antes da luta acontecer, o sistema verifica:
- Se os lutadores pertencem à **mesma categoria de peso**
 
❌ Caso contrário:
> A luta é automaticamente cancelada.
 
---
 
### 🥊 Simulação de Luta
Se a luta for válida:
- Um resultado é gerado **aleatoriamente**, podendo ser:
  - Vitória do lutador
  - Vitória do desafiante
  - Empate
 
✔️ Após a luta, os **registros dos lutadores são atualizados**.
 
---
 
### 📊 Apresentação dos Dados
O sistema exibe:
- Informações completas dos lutadores antes da luta
- Resultado final da luta
 
---
 
## 🎲 Lógica da Simulação
 
A decisão do vencedor é baseada em um sistema aleatório, garantindo imprevisibilidade em cada execução.
 
### Exemplo de saída:
